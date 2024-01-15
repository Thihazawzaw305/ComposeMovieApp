package com.example.composemovieapp.navigation

import java.lang.IllegalArgumentException


//www.google.com/sign_in
enum class MovieScreens {
    HomeScreen,
    MovieDetailsScreen;
    companion object{
        fun fromRoute(route : String?): MovieScreens = when(route?.substringBefore("/")){
            HomeScreen.name -> HomeScreen
            MovieDetailsScreen.name -> MovieDetailsScreen
            null -> HomeScreen
            else -> throw  throw IllegalArgumentException("Route $route is not recognize")
        }
    }
}