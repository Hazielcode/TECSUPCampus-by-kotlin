package com.tecsup.campus.ui.theme.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.tecsup.campus.model.Evento
import com.tecsup.campus.ui.theme.*

@Composable
fun EventosScreen(navController: NavHostController) {

    val eventos = listOf(
        Evento("15 Oct", "Feria de Proyectos", "Auditorio A"),
        Evento("22 Oct", "Hackathon Tecsup", "Sala de Innovación"),
        Evento("30 Oct", "Charla de Empleabilidad", "Aula Magna")
    )

    TecsupBackground {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Text(
                text = "📅 Próximos Eventos",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = TecsupCeleste,
                modifier = Modifier.padding(bottom = 12.dp)
            )

            LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                items(eventos) { evento ->
                    EventoCard(evento)
                }
            }
        }
    }
}

@Composable
fun EventoCard(evento: Evento) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(6.dp),
        colors = CardDefaults.cardColors(containerColor = TecsupWhite)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = evento.fecha,
                style = MaterialTheme.typography.bodyMedium,
                fontWeight = FontWeight.Bold,
                color = TecsupCeleste
            )
            Text(
                text = evento.titulo,
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = evento.lugar,
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}
