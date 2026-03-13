package com.example.carteirinha.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.carteirinha.feature.auth.presentation.LoginScreen

@Composable
fun AppNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Routes.Home.route
    ) {
        composable(Routes.Login.route){
            LoginScreen()
        }
        composable(Routes.Login.route){
//            HomeScreen()
        }
    }
}