package Coroutine

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.yield
import java.util.logging.Logger

@Composable

fun screen(){

    val scope= rememberCoroutineScope()

    LaunchedEffect(Unit) {

        launch {
            Log.d("Coroutine","task 1")

            delay(1000)

            Log.d("Coroutine","remaining of task 1")
        }

        launch {

            Log.d("Coroutine","task 2")

        }
        launch {

            Log.d("Coroutine","task 3")

            yield()

            Log.d("Coroutine","remaining of task 3")

        }
        launch {

            Log.d("Coroutine","task 4")
        }
        launch {

            Log.d("Coroutine","task 5")
        }
        launch {

            Log.d("Coroutine","task 6")
        }
        launch {

            Log.d("Coroutine", "task 7")
        }


    }

}