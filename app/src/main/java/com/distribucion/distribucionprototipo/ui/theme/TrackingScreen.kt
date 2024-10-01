package com.distribucion.distribucionprototipo.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun TrackingScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()  // Esto llena el tamaño total disponible
            .padding(16.dp),  // Añadimos un padding de 16dp a los lados
        horizontalAlignment = Alignment.CenterHorizontally,  // Alineación horizontal al centro
        verticalArrangement = Arrangement.Center  // Alineación vertical al centro
    ) {
        // Título de la pantalla
        Text(
            text = "Monitoreo de Seguimiento",
            style = MaterialTheme.typography.headlineMedium  // Utilizamos un estilo más grande
        )
        Spacer(modifier = Modifier.height(16.dp))  // Espacio entre los elementos

        // Texto que describe las funciones
        Text(text = "Funciones de seguimiento:")
        Spacer(modifier = Modifier.height(8.dp))  // Espacio entre el texto y el botón

        // Botón para calcular despacho (simulación)
        Button(onClick = { /* Simulación de cálculo de despacho */ }) {
            Text(text = "Calcular Despacho")
        }
        Spacer(modifier = Modifier.height(8.dp))  // Espacio entre los botones

        // Botón para monitorear temperatura (simulación)
        Button(onClick = { /* Simulación de monitoreo de temperatura */ }) {
            Text(text = "Monitorear Temperatura")
        }

        Spacer(modifier = Modifier.height(20.dp))  // Espacio final antes de la acción de volver

        // Botón para regresar a la pantalla anterior
        Button(onClick = { navController.navigateUp() }) {
            Text("Volver")
        }
    }
}
