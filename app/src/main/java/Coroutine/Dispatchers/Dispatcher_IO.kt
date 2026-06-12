package Coroutine.Dispatchers

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


@Composable

fun dis(){
    val scope= rememberCoroutineScope()
    LaunchedEffect(Unit) {
        launch(Dispatchers.IO){

            Log.d("Coroutine","${Thread.currentThread().name}")
        }


        launch(Dispatchers.Main) {

            Log.d("Coroutine","${Thread.currentThread().name}")

        }
        launch(Dispatchers.Default) {

            Log.d("Coroutine","${Thread.currentThread().name}")

        }


    }

}