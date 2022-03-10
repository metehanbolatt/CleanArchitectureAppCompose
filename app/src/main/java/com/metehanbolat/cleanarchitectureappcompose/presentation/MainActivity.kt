package com.metehanbolat.cleanarchitectureappcompose.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.cleanarchitectureappcompose.presentation.ui.theme.CleanArchitectureAppComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CleanArchitectureAppComposeTheme {

            }
        }
    }
}
