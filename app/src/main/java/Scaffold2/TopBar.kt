package Scaffold2

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.vector.ImageVector
//import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
//import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.jetpack.Scaffold1.Routess

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
//@Preview(showBackground = true, showSystemUi = true)


fun mno(navController: NavHostController) {








    Scaffold(
        topBar = {

                TopAppBar(
                    title = {
                        Text(
                            text = "Mission Android 2026",
                            fontSize = 20.sp
                        )
                    },
                    navigationIcon = {

                        IconButton(onClick = { }) {

                            Icon(
                                imageVector = Icons.Default.Menu,
                                contentDescription = "Menu Bar"
                            )
                        }

                    },
                    actions = {
                        IconButton(onClick = { }) {

                            Icon(
                                imageVector = Icons.Default.Search,
                                contentDescription = "Menu Search",

                                )
                        }

                        IconButton(onClick = { }) {

                            Icon(
                                imageVector = Icons.Default.MoreVert,
                                contentDescription = "MoreVert"
                            )
                        }
                    },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = Color.Yellow,
                        titleContentColor = Color.Black,
                        actionIconContentColor = Color.Black,
                        navigationIconContentColor = Color.Black

                    )

                )


        }
        ,
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                IconButton(onClick = { }) {
                    Icon(
                        imageVector = Icons.Default.Add,
                        contentDescription = "Add symbol"
                    )
                }

            }
        },
        bottomBar = {


            BottomAppBar(
                containerColor = Color.DarkGray.copy(alpha = 0.3f),

                ) {


                Row(
                    modifier = Modifier.fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(onClick = {navController.navigate(Route.homescreen)
                    {
                        launchSingleTop=true
                    }


                    })

                    {
                        Icon(
                            imageVector = Icons.Default.Home,
                            contentDescription = "Home",
                            modifier = Modifier.size(50.dp)


                        )
                    }
                    IconButton(onClick = {navController.navigate(Route.searchscreen)
                    {
                        launchSingleTop=true
                    }

                    }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Search,
                            contentDescription = "Search",
                            modifier = Modifier.size(50.dp)

                        )

                    }
                    IconButton(onClick = {
                        navController.navigate(Route.notificationscreen)
                        {
                            launchSingleTop=true
                        }
                    }) {
                        Icon(
                            imageVector = Icons.Default.Notifications,
                            contentDescription = "Notification",
                            modifier = Modifier.size(50.dp)


                        )

                    }

                    IconButton(onClick = { navController.navigate(Route.profilescreen)
                    {
                        launchSingleTop=true
                    }}) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = "Person",
                            modifier = Modifier.size(50.dp)


                        )

                    }

                }


            }
        }



    )

    {



    }


}


