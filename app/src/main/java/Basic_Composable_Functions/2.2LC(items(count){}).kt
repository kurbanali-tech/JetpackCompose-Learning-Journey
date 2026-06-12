package com.example.jetpack.Basic_Composable_Functions

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview



@Composable
fun MyLazyColumn() {



    LazyColumn {


        items(count = 10) { index ->
            Text(text = "Item ${index + 1}")
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewMyLazyColumn() {
    MyLazyColumn()
}