package com.example.loginuiapp.ui.screen.registration

import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.loginuiapp.R
import com.example.loginuiapp.ui.components.AuthenticationScreenTemplate
import com.example.loginuiapp.ui.theme.PrimaryViolet
import com.example.loginuiapp.ui.theme.PrimaryVioletDark
import com.example.loginuiapp.ui.theme.PrimaryVioletLight

@Composable
fun RegistrationScreen(
    modifier: Modifier = Modifier,
    onRegisterClicked: () -> Unit,
    onLoginClicked: () -> Unit
) {
    AuthenticationScreenTemplate(
        modifier = modifier,
        backgroundGradient = arrayOf(
            0f to PrimaryViolet,
            1f to PrimaryVioletDark
        ),
        imgRes = R.drawable.img_coder_w,
        title = "Hi there !",
        subtitle = "Let's Get Started",
        mainActionButtonTitle = "Create an Account",
        secondaryActionButtonTitle = "Log In",
        mainActionButtonColors = ButtonDefaults.buttonColors(
            containerColor = PrimaryVioletDark,
            contentColor = Color.White
        ),
        secondaryButtonColors = ButtonDefaults.buttonColors(
            containerColor = PrimaryVioletLight,
            contentColor = Color.White
        ),
        actionButtonShadowColor = PrimaryVioletDark,
        onMainActionButtonClicked = onRegisterClicked,
        onSecondaryActionButtonClicked = onLoginClicked
    )
}