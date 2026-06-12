package Coroutine

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.yield

@Composable

fun home(){

    val scope= rememberCoroutineScope()

    LaunchedEffect(Unit) {
        launch {
            while (true){
                //yield()

                delay(100)

                Log.d("Coroutine","task1")

            }
        }
    }

}

@Composable
fun wall(){

    val scope= rememberCoroutineScope()

    LaunchedEffect(Unit) {
        launch {
            while (true){
                Log.d("Coroutine","task2")
            }
        }
    }

}