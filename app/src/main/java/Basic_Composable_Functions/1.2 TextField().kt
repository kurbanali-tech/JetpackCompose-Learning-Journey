package com.example.jetpack.Basic_Composable_Functions
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable

fun Textfield(){

    var text=remember { mutableStateOf(value = "") }


    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        TextField(
            value = text.value,

            onValueChange = {
                text.value = it
            },
            label = { Text("ENTER YOUR NAME") },
            placeholder = { Text("Enter your name" )},


            )
    }


}
