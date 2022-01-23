package com.testaplication.presentation.navigation.bottom_bar

import com.testaplication.R

sealed class BottomBarScreen(
    val title: String,
    val route: String,
    val iconId: Int
) {

    object Matches : BottomBarScreen(
        route = "matches",
        title = "Matches",
        iconId = R.drawable.ic_football_bottom
    )

    object Saved : BottomBarScreen(
        route = "saved",
        title = "Saved",
        iconId = R.drawable.ic_favourite
    )

    object Items {
        val listOfItems = listOf(
            Matches, Saved
        )
    }

}