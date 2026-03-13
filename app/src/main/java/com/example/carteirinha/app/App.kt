package com.example.carteirinha.app

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.carteirinha.core.navigation.AppNavHost

@Composable
fun App(){
    MaterialTheme(){
        val navController = rememberNavController()
        AppNavHost(
            navController = navController
        )
    }
}