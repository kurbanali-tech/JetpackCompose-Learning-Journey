package Scaffold2

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable

fun Nav() {

    val navController = rememberNavController()

    mno(navController = navController)


    NavHost(navController = navController, startDestination = Route.homescreen) {



        composable<Route.homescreen> {
            hm(navController)

        }
        composable<Route.searchscreen> {
            sh(navController)
        }
        composable<Route.profilescreen> {
            pe(navController)
        }
        composable<Route.notificationscreen> {
            nt(navController)
        }

    }
}



