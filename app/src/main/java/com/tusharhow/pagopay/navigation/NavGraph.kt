package com.tusharhow.pagopay.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.tusharhow.pagopay.views.HistoryPage
import com.tusharhow.pagopay.views.HomePage


@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route
    ) {
        composable(route = Screen.HomeScreen.route) {
            HomePage(navController = navController)
        }
        composable(route = Screen.HistoryScreen.route) {
            HistoryPage(navController = navController)
        }
    }
}