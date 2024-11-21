package com.example.bookingcard.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.MaterialTheme

private val LightColors = lightColorScheme(
    primary = colorPrimary,
    primaryContainer = colorPrimaryVariant,
    secondary = colorSecondary,
    background = colorBackground,
    surface = colorWhite,
    onPrimary = colorWhite,
    onSecondary = colorBlack,
    onBackground = colorBlack,
    onSurface = colorBlack
)

private val DarkColors = darkColorScheme(
    primary = colorPrimary,
    primaryContainer = colorPrimaryVariant,
    secondary = colorSecondary,
    background = colorBlack,
    surface = colorBlack,
    onPrimary = colorBlack,
    onSecondary = colorWhite,
    onBackground = colorWhite,
    onSurface = colorWhite
)

@Composable
fun BookingCardTheme(
    darkTheme: Boolean = false,  // Set this based on the user's system preference
    content: @Composable () -> Unit
) {
    // Choose the light or dark theme based on the darkTheme boolean
    val colors = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,  // Use default typography or customize it
        content = content
    )
}
