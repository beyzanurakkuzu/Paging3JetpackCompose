package com.beyzaakkuzu.paging3demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.beyzaakkuzu.paging3demo.ui.theme.Paging3demoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Paging3demoTheme {

                }
            }
        }
    }
