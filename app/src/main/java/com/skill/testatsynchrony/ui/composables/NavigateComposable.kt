package com.skill.testatsynchrony.ui.composables

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.skill.testatsynchrony.ui.screens.CatListScreen
import com.skill.testatsynchrony.ui.screens.CatDetailsScreen
import com.skill.testatsynchrony.ui.screens.ProfileScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "profile") {
        composable(route = "profile") {
            ProfileScreen(onNavigateToCatList = { navController.navigate("catList") })
        }
        composable(route = "catList") {
            CatListScreen(navController = navController)
        }
        composable(route = "catDetails") {
            CatDetailsScreen(navController = navController)
        }
    }
}