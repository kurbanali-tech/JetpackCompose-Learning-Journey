package com.example.jetpack.Basic_Composable_Functions

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.jetpack.R

@Composable

fun box(){
    Box(
        modifier = Modifier.fillMaxSize().background(Color.Blue).wrapContentSize(Alignment.Center)

    ) {
        Image(
            painter = painterResource(R.drawable.heart),
            contentDescription = "heart"
        )
        Image(
            painter = painterResource(R.drawable.arrow_image),
            contentDescription = "Arrow Shape"
        )

    }
}
