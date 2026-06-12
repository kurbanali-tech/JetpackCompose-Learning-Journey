package com.example.jetpack.Basic_Composable_Functions

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable


fun Xyz(){

    Column(
        modifier = Modifier.Companion.padding(top = 100.dp, start = 50.dp, end = 40.dp)
            .fillMaxSize(),

        ) {

        var text = remember { mutableStateOf(value = " ") }
        TextField(
            value = text.value,
            onValueChange = { text.value = it },
            label = { Text(text = "enter your name") },


            )


        var SET = remember { mutableStateOf(value = " ") }
        TextField(
            value = SET.value,
            onValueChange = { SET.value = it },
            placeholder = {
                Text(
                    text = "enter your age",
                    color = Color.Companion.Black,
                    fontWeight = FontWeight.Companion.ExtraBold,

                    )

            },
            modifier = Modifier.Companion.padding(top = 50.dp)
        )

    }




}