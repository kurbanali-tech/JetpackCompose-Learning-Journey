package com.example.jetpack.Scaffold_Toast_and_SnackBar

import android.view.Gravity
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

@Composable
@Preview(showBackground = true, showSystemUi = true)

fun snak() {
    val snackbarHostState= remember{SnackbarHostState()}

    val scope= rememberCoroutineScope()
    Scaffold(
        snackbarHost = {
            SnackbarHost(
                hostState = snackbarHostState


            )
        }
    ) {
        innerPadding->

        Column(
            modifier = Modifier.fillMaxSize().padding(start = 20.dp, end = 20.dp).padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = {
                    scope.launch {
                        snackbarHostState.showSnackbar(
                            message = "this is a snackbar",
                            actionLabel = "Undo",
                            duration = SnackbarDuration.Long
                        )
                    }


                },
                modifier = Modifier.fillMaxWidth()
            ) {

                Text(
                    text = "Tap here",
                    fontSize = 50.sp
                )

            }
        }

    }
}