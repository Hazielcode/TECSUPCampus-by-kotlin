package com.tecsup.campus.ui.theme.screens

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.tecsup.campus.R
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {

    var startAnimation by remember { mutableStateOf(false) }
    val alphaAnim = animateFloatAsState(
        targetValue = if (startAnimation) 1f else 0f,
        label = "splashAlpha"
    )

    // Animación de opacidad (fade-in)
    LaunchedEffect(key1 = true) {
        startAnimation = true
        delay(2500) // duración de la animación
        navController.navigate("home") {
            popUpTo("splash") { inclusive = true }
        }
    }

    // Fondo degradado TECSUP
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFE3F2FD), // celeste claro
                        Color.White        // blanco
                    )
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.ic_tecsup_logo),
                contentDescription = "Logo TECSUP",
                modifier = Modifier
                    .size(180.dp)
                    .alpha(alphaAnim.value)
            )

            Spacer(modifier = Modifier.height(20.dp))

            androidx.compose.material3.Text(
                text = "Campus TECSUP",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF5EB8FF),
                modifier = Modifier.alpha(alphaAnim.value)
            )

            Spacer(modifier = Modifier.height(8.dp))

            androidx.compose.material3.Text(
                text = "Innovación • Tecnología • Educación",
                style = MaterialTheme.typography.bodyMedium,
                color = Color(0xFF333333),
                modifier = Modifier.alpha(alphaAnim.value)
            )
        }
    }
}
