package com.example.loginuiapp.ui.screen.login

import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.loginuiapp.R
import com.example.loginuiapp.ui.components.AuthenticationScreenTemplate
import com.example.loginuiapp.ui.theme.PrimaryPink
import com.example.loginuiapp.ui.theme.PrimaryPinkBlended
import com.example.loginuiapp.ui.theme.PrimaryPinkDark
import com.example.loginuiapp.ui.theme.PrimaryPinkLight

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    onLoginClicked: () -> Unit,
    onRegistrationClicked: () -> Unit
) {
    AuthenticationScreenTemplate(
        modifier = modifier,
        backgroundGradient = arrayOf(
            0f to PrimaryPinkBlended,
            1f to PrimaryPink
        ),
        imgRes = R.drawable.img_coder_m,
        title = "Welcome back !",
        subtitle = "Please, Log In.",
        mainActionButtonTitle = "Continue",
        secondaryActionButtonTitle = "Create an Account",
        mainActionButtonColors = ButtonDefaults.buttonColors(
            containerColor = PrimaryPinkDark,
            contentColor = Color.White
        ),
        secondaryButtonColors = ButtonDefaults.buttonColors(
            containerColor = PrimaryPinkLight,
            contentColor = Color.White
        ),
        actionButtonShadowColor = PrimaryPinkDark,
        onMainActionButtonClicked = onLoginClicked,
        onSecondaryActionButtonClicked = onRegistrationClicked
    )
}