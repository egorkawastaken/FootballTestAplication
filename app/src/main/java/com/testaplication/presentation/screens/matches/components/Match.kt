package com.testaplication.presentation.screens.matches.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Match(
//    onFavouriteClick: () -> Unit,
isFavourite: Boolean
) {
    Card(
        shape = RoundedCornerShape(8.dp),
        backgroundColor = MaterialTheme.colors.surface,
        elevation = 8.dp,

    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
        ){
            Box(
                modifier = Modifier.fillMaxWidth().padding(8.dp).align(Alignment.CenterStart)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(0.5f),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Team1",
                        style = MaterialTheme.typography.h6
                    )
                    Text(
                        text = "0-1",
                        style = MaterialTheme.typography.h6
                    )
                    Text(
                        text = "Team2",
                        style = MaterialTheme.typography.h6
                        )
                }

            }
            IconButton(onClick = { /*TODO*/ },
                modifier = Modifier.align(Alignment.CenterEnd)
            ) {
                Icon(
                    imageVector = if(isFavourite) Icons.Default.Favorite else Icons.Default.FavoriteBorder,
                    contentDescription = "Favorite"
                )
            }

        }

    }
}

@Composable
@Preview
fun Prev1(){
    Match(false)
}