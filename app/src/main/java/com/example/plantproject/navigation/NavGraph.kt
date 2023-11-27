package com.example.plantproject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.plantproject.navigation.screens.HomeScreen
import com.example.plantproject.navigation.screens.PlantSection

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {





    // tutaj okreslamy tylko startowy widok, w klamrach reszte
    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(route = Screen.Home.route) {
            //TODO zrobic te ekrany
            HomeScreen(navController = navController)
        }
        composable(route = Screen.Detail.route){
//            LoginMain(navController = navController)
        }
        composable(route = Screen.PlantSection.route){
            PlantSection(navController = navController)
        }




    }
}