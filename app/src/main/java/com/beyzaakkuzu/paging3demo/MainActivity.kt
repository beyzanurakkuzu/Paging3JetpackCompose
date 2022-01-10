package com.beyzaakkuzu.paging3demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import androidx.paging.ExperimentalPagingApi
import coil.annotation.ExperimentalCoilApi
import com.beyzaakkuzu.paging3demo.navigation.SetupNavGraph
import com.beyzaakkuzu.paging3demo.ui.theme.Paging3demoTheme
import dagger.hilt.android.AndroidEntryPoint


@ExperimentalPagingApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Paging3demoTheme {
                    val navController= rememberNavController()
                    SetupNavGraph(navController = navController)
                }
            }
        }
    }



