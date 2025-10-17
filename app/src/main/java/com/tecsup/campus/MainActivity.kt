package com.tecsup.campus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.tecsup.campus.ui.theme.TECSUPCampusTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TECSUPCampusTheme {
                val navController = rememberNavController()
                var expanded by remember { mutableStateOf(false) }

                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = { Text("TECSUP Campus") },
                            actions = {
                                IconButton(onClick = { expanded = true }) {
                                    Icon(Icons.Default.MoreVert, contentDescription = "Menú")
                                }
                                DropdownMenu(
                                    expanded = expanded,
                                    onDismissRequest = { expanded = false }
                                ) {
                                    DropdownMenuItem(
                                        text = { Text("Inicio") },
                                        onClick = {
                                            expanded = false
                                            navController.navigate("home")
                                        }
                                    )
                                    DropdownMenuItem(
                                        text = { Text("Cursos") },
                                        onClick = {
                                            expanded = false
                                            navController.navigate("cursos")
                                        }
                                    )
                                    DropdownMenuItem(
                                        text = { Text("Instructores") },
                                        onClick = {
                                            expanded = false
                                            navController.navigate("instructores")
                                        }
                                    )
                                    DropdownMenuItem(
                                        text = { Text("Eventos") },
                                        onClick = {
                                            expanded = false
                                            navController.navigate("eventos")
                                        }
                                    )
                                    DropdownMenuItem(
                                        text = { Text("Acerca de") },
                                        onClick = {
                                            expanded = false
                                            navController.navigate("acerca")
                                        }
                                    )
                                }
                            }
                        )
                    }
                ) { innerPadding ->
                    Surface(
                        modifier = Modifier.padding(innerPadding),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        NavGraph(navController = navController)
                    }
                }
            }
        }
    }
}
