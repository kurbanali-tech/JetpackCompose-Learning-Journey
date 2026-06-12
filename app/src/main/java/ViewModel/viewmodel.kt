package ViewModel

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable



fun view(viewmodal: Viewmodal){

    Column(modifier = Modifier.fillMaxSize().padding(horizontal = 40.dp),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {
        Text("Score=${viewmodal.score}",
            fontSize = 25.sp)
        Button(onClick = {viewmodal.increament()},
            modifier = Modifier.fillMaxWidth()) {

            Text("Increase")

        }

        Button(onClick = {viewmodal.decreament()},
            modifier = Modifier.fillMaxWidth()) {


            Text("Decrease")
        }



    }
}