package me.samuki.navigation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import me.samuki.navigation.AppNavigation
import me.samuki.navigation.destinations.Destination

@Composable
fun GraphBuilder(destinations: Set<Destination>) {
    val navController = rememberNavController()
    val appNavigation = AppNavigation(navController)

    NavHost(navController = navController, startDestination = "") {

    }
}