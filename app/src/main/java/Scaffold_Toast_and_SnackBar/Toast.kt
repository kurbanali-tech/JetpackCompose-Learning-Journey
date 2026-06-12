package com.example.jetpack.Scaffold_Toast_and_SnackBar

import android.view.Gravity
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true, showSystemUi = true)

fun toast(){
    val context= LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize().padding(start = 20.dp, end = 20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
           val toast= Toast.makeText(
                context,
                "here is the TOAST message",
                 Toast.LENGTH_SHORT
            )

            toast.setGravity(Gravity.TOP,0,50)
            toast.show()






        },
            modifier = Modifier.fillMaxWidth()) {

            Text(text = "Tap here",
                fontSize = 50.sp)

        }
    }


}