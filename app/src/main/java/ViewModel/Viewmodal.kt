package ViewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


class Viewmodal: ViewModel() {

    var score by mutableStateOf(value = 0)
        private set


    fun increament() {

        score++
    }
    fun decreament(){

        score--
    }

}