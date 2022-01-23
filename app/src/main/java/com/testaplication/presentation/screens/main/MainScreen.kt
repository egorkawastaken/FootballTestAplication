package com.testaplication.presentation.screens.main

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.testaplication.presentation.navigation.NavGraph
import com.testaplication.presentation.navigation.bottom_bar.BottomBar

@Composable
fun MainScreen() {

    val navController = rememberNavController()

    Scaffold(
        backgroundColor = MaterialTheme.colors.surface,
        bottomBar = {
            BottomBar(navController = navController)
        }
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            NavGraph(navController = navController)
        }
    }

}