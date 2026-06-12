package com.example.jetpack
import Coroutine.Dispatchers.dis
import Coroutine.compare
import SideEffect.disposable
import SideEffect.launch
//import Scaffold2.profile
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.jetpack.Basic_Composable_Functions.Col
import com.example.jetpack.Basic_Composable_Functions.MyImage
import com.example.jetpack.Basic_Composable_Functions.MyLazyColumn
import com.example.jetpack.Basic_Composable_Functions.Textfield
import com.example.jetpack.Basic_Composable_Functions.box

//import com.example.jetpack.Scaffold1.app


class MainActivity : ComponentActivity() {
    //val viewModel: Viewmodal by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyImage()
        }

    }

}



























