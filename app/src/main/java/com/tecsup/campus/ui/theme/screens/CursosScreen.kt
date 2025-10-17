package com.tecsup.campus.ui.theme.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.tecsup.campus.R
import com.tecsup.campus.model.Curso
import com.tecsup.campus.ui.theme.TecsupBackground
import com.tecsup.campus.ui.theme.TecsupCeleste
import com.tecsup.campus.ui.theme.TecsupWhite

@Composable
fun CursosScreen(navController: NavHostController) {

    val cursos = listOf(
        Curso("Kotlin", "UIs declarativas con Compose", R.drawable.ic_kotlin),
        Curso("Python", "Análisis de datos", R.drawable.ic_python),
        Curso("SQL", "Gestión de bases de datos", R.drawable.ic_sql)
    )

    TecsupBackground {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            // 🔹 Título principal
            Text(
                text = "📚 Cursos Disponibles",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = TecsupCeleste,    // 👈 corregido (coma agregada)
                modifier = Modifier.padding(bottom = 12.dp)
            )

            // 🔹 Lista dinámica
            LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                items(cursos) { curso ->
                    CursoCard(curso)
                }
            }
        }
    }
}

@Composable
fun CursoCard(curso: Curso) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(6.dp),
        colors = CardDefaults.cardColors(containerColor = TecsupWhite)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = curso.imagen),
                contentDescription = curso.nombre,
                modifier = Modifier
                    .size(64.dp)
                    .padding(end = 16.dp)
            )

            Column {
                Text(
                    text = curso.nombre,
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = TecsupCeleste    // 👈 color institucional para nombres
                )
                Text(
                    text = curso.descripcion,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}
