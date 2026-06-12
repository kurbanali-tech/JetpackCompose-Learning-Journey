package com.example.jetpack.Basic_Composable_Functions

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable


fun mm(){
    Column() {
        var temp = remember { mutableStateOf(value = "") }
        TextField(
            value = temp.value,
            onValueChange = { temp.value = it },
            placeholder = { Text(text = "Enter your name") }


        )
        var temp2 = remember { mutableStateOf(value = "") }
        TextField(
            value = temp2.value,
            onValueChange = { temp2.value = it },
            label = { Text(text = "Enter your date of birth") }

        )

    }

}