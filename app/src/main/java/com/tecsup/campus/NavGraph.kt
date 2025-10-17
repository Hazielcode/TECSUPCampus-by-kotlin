package com.tecsup.campus


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.tecsup.campus.ui.theme.screens.AcercaScreen
import com.tecsup.campus.ui.theme.screens.CursosScreen
import com.tecsup.campus.ui.theme.screens.EventosScreen
import com.tecsup.campus.ui.theme.screens.HomeScreen
import com.tecsup.campus.ui.theme.screens.InstructoresScreen
import com.tecsup.campus.ui.theme.screens.*
@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "splash"  // 👈 Inicia con Splash
    ) {
        composable("splash") { SplashScreen(navController) }
        composable("home") { HomeScreen(navController) }
        composable("cursos") { CursosScreen(navController) }
        composable("instructores") { InstructoresScreen(navController) }
        composable("eventos") { EventosScreen(navController) }
        composable("acerca") { AcercaScreen(navController) }
    }
}