package Coroutine

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable

fun compare(){

    val scope= rememberCoroutineScope()

    LaunchedEffect(Unit) {

        launch {
            Log.d("Coroutine","Launch Example")
        }
        val ret=async {
            Log.d("Coroutine","Async Example")
            delay(5000)
            var z=10+20

            return@async z

        }
        Log.d("Coroutine","${ret.await()}")
    }
}