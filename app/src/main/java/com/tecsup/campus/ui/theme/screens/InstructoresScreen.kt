package com.tecsup.campus.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.tecsup.campus.R
import com.tecsup.campus.model.Instructor
import com.tecsup.campus.ui.theme.*

@Composable
fun InstructoresScreen(navController: NavHostController) {

    // 🔹 Lista de instructores con sus fotos reales
    val instructores = listOf(
        Instructor("Elliot", "Kotlin / Android", R.drawable.ic_elliot),
        Instructor("Silvia", "Gestión de TI", R.drawable.ic_silvia),
        Instructor("Farfán", "Bases de Datos", R.drawable.ic_farfan)
    )

    TecsupBackground {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            // 🔹 Título principal
            Text(
                text = "👩‍🏫 Instructores del Campus",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = TecsupCeleste,
                modifier = Modifier.padding(bottom = 12.dp)
            )

            // 🔹 Lista de instructores
            LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                items(instructores) { instructor ->
                    InstructorCard(instructor)
                }
            }
        }
    }
}

@Composable
fun InstructorCard(instructor: Instructor) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(6.dp),
        colors = CardDefaults.cardColors(containerColor = TecsupWhite)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(16.dp)
        ) {
            // 🔹 Foto del instructor
            Image(
                painter = painterResource(id = instructor.imagen),
                contentDescription = instructor.nombre,
                modifier = Modifier
                    .size(70.dp)
                    .padding(end = 16.dp)
            )

            // 🔹 Nombre y especialidad
            Column {
                Text(
                    text = instructor.nombre,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = TecsupCeleste
                )
                Text(
                    text = instructor.especialidad,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}
