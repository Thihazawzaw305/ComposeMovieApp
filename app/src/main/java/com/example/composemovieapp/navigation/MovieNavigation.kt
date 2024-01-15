package com.example.composemovieapp.navigation

import MovieDetailsScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.composemovieapp.screens.home.HomeScreen

@Composable
fun MovieNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = MovieScreens.HomeScreen.name) {
        composable(MovieScreens.HomeScreen.name) {
            HomeScreen(navController =navController)
        }

        composable(MovieScreens.MovieDetailsScreen.name + "/{movie}", arguments = listOf(navArgument(name = "movie") {type = NavType.StringType})) {
          backStackEntry ->
            MovieDetailsScreen(navController = navController,
                backStackEntry.arguments?.getString("movie"))
        }
    }
}
