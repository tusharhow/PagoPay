package com.tusharhow.pagopay.navigation


sealed class Screen(val route: String) {
    data object HomeScreen : Screen("home")

}