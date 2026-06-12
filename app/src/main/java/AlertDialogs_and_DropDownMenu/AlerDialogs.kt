package com.example.jetpack.AlertDialogs_and_DropDownMenu

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.currentCompositionContext
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack.Scaffold_Toast_and_SnackBar.toast

@Composable
@Preview(showBackground = true, showSystemUi = true)

fun alert(){
    var openDialog = remember { mutableStateOf(value =false) }

    val context= LocalContext.current

    Row(
        modifier = Modifier.fillMaxSize().padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            modifier = Modifier.fillMaxWidth().size(150.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.LightGray,
                contentColor = Color.Black
            ),
            shape = CutCornerShape(topStart = 20.dp)
        ) {


            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
            Text(
                text = "Alert Dialog Example",
                fontSize = 25.sp

            )

            IconButton(onClick = {openDialog.value=true},
                modifier = Modifier.size(40.dp)) {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "Delete"

                )
            }

        }

    }
    }

    if (openDialog.value){
        AlertDialog(
            onDismissRequest = {
                openDialog.value=false
            },
            title = {Text(text = "Delete Item")},
            text = {Text(text = "Are you sure,you want to delete this item")},

            confirmButton = {
                Button(onClick = {
                    val toast= Toast.makeText(
                        context,
                        "Your item is successfully Deleted",
                        Toast.LENGTH_LONG

                    )
                    toast.show()

                    openDialog.value=false
                }


                ) {
                    Text("Delete")
                }
            },
            dismissButton = {
                Button(onClick = {openDialog.value=false}) {
                    Text("Cancell")
                }
            }

        )

    }

}