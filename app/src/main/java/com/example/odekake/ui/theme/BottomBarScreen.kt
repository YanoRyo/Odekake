package com.example.odekake.ui.theme

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector,
){
    object Home: BottomBarScreen(
        route = "home",
        title = "ホーム",
        icon = Icons.Default.Home
    )
    object Post: BottomBarScreen(
        route = "post",
        title = "投稿",
        icon = Icons.Default.Add
    )
    object Profile: BottomBarScreen(
        route = "profile",
        title = "マイページ",
        icon = Icons.Default.Person
    )
    object Topics: BottomBarScreen(
        route = "Topics",
        title = "Topics",
        icon = Icons.Default.Create
    )
}
