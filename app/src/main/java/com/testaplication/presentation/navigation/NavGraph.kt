package com.testaplication.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.testaplication.presentation.navigation.bottom_bar.BottomBarScreen
import com.testaplication.presentation.screens.matches.MatchesScreen
import com.testaplication.presentation.screens.saved.SavedScreen

@Composable
fun NavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Matches.route
    ) {

        composable(route = BottomBarScreen.Matches.route) {
            MatchesScreen()
        }

        composable(route = BottomBarScreen.Saved.route) {
            SavedScreen()
        }

    }
}