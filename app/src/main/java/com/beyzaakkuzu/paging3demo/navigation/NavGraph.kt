package com.beyzaakkuzu.paging3demo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.paging.ExperimentalPagingApi
import coil.annotation.ExperimentalCoilApi
import com.beyzaakkuzu.paging3demo.screens.home.HomeScreen

@ExperimentalCoilApi
@Composable
@ExperimentalPagingApi
fun SetupNavGraph(navController: NavHostController){
    NavHost(navController = navController as NavHostController,
        startDestination = Screen.Home.route ){
        composable(route =Screen.Home.route){
            HomeScreen(navController=navController)

        }
        composable(route= Screen.Search.route){
            //SearchScreen(navController= navController)
        }
    }
}





