package com.tecsup.campus.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = TecsupCeleste,
    secondary = TecsupLight,
    background = TecsupLight,
    surface = TecsupWhite,
    onPrimary = TecsupWhite,
    onBackground = TecsupText,
    onSurface = TecsupText
)

private val DarkColors = darkColorScheme(
    primary = TecsupCeleste,
    secondary = TecsupLight,
    background = TecsupText,
    surface = TecsupGray,
    onPrimary = TecsupText,
    onBackground = TecsupWhite
)

@Composable
fun TECSUPCampusTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        content = content
    )
}
