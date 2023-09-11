package com.example.odekake.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.odekake.screens.HomeScreen
import com.example.odekake.screens.PostsScreen
import com.example.odekake.screens.ProfileScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Profile.route) {
            PostsScreen()
        }
        composable(route = BottomBarScreen.Post.route) {
            ProfileScreen()
        }
        composable(route = BottomBarScreen.Topics.route) {
            ProfileScreen()
        }

    }
}