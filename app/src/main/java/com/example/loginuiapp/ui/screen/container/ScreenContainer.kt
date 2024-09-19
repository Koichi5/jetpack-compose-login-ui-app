package com.example.loginuiapp.ui.screen.container

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginuiapp.ui.screen.home.HomeScreen
import com.example.loginuiapp.ui.screen.login.LoginScreen
import com.example.loginuiapp.ui.screen.registration.RegistrationScreen
import com.example.loginuiapp.ui.screen.welcome.WelcomeScreen

@Composable
fun ScreenContainer() {
    val navHost = rememberNavController()

    NavHost(navController = navHost, startDestination = NavGraph.Welcome.route) {
        composable(NavGraph.Welcome.route) {
            WelcomeScreen(
                onOpenLoginClicked = {
                    navHost.navigate(NavGraph.Login.route)
                }
            )
        }
        composable(NavGraph.Login.route) {
            LoginScreen(
                onLoginClicked = {
                    navHost.navigate(NavGraph.Home.route)
                },
                onRegistrationClicked = {
                    navHost.navigate(NavGraph.Registration.route)
                }
            )
        }
        composable(NavGraph.Registration.route) {
            RegistrationScreen(
                onRegisterClicked = {
                    navHost.navigate(NavGraph.Home.route)
                },
                onLoginClicked = {
                    navHost.navigate(NavGraph.Login.route)
                }
            )
        }
        composable(NavGraph.Home.route) {
            HomeScreen(
                onRestartFlowClicked = {
                    navHost.navigate(NavGraph.Welcome.route)
                }
            )
        }
    }
}