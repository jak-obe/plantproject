package com.example.plantproject.navigation

sealed class Screen(val route: String) {

    object Home : Screen(route = "homescreen")

    object Detail : Screen(route = "detailscreen")

    object PlantSection: Screen(route = "plantsectionscreen")
}