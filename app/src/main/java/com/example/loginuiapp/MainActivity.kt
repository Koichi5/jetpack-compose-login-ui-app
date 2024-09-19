package com.example.loginuiapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.loginuiapp.ui.screen.container.ScreenContainer
import com.example.loginuiapp.ui.theme.LoginUiAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginUiAppTheme {
                ScreenContainer()
            }
        }
    }
}