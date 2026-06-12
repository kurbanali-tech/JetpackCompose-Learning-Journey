package com.example.jetpack.Basic_Composable_Functions

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MyLazyColumnIndex() {

    LazyColumn {

        items(count = 10) { index ->

            Text(
                text = "Index = $index"
            )

        }

    }

}