package Coroutine
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield

@Composable

fun sc1(){

    val scope= rememberCoroutineScope()
    LaunchedEffect(Unit) {

        runBlocking {


            launch {

                //delay(500)
                yield()
                Log.d("Coroutine", "task 1")

            }

        }

    }

}

















