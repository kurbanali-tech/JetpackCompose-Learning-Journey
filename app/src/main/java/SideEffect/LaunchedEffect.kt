package SideEffect

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true, showSystemUi = true)

fun launch(){
    var score by remember { mutableStateOf(value = 1) }

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
        ) {
        Column() {

            Button(onClick = {
                score++
            }) {
                Text("Increament $score",
                    fontSize = 50.sp
                        )
            }
            LaunchedEffect(key1 = Unit){
                var z=APIcall()
                Log.d("SideEffect","$z $score")

            }

        }

    }
}
fun APIcall(): List<String>{

    return listOf("papaya","orange","mango","grapes")

}