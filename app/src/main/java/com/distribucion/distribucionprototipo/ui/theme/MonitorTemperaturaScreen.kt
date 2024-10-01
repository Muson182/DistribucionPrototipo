package com.distribucion.distribucionprototipo.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MonitorTemperaturaScreen(navController: NavController? = null) {
    var temperatura by remember { mutableStateOf(0) }  // Valor simulado

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Monitoreo de Temperatura", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Temperatura Actual: $temperatura°C")
        Spacer(modifier = Modifier.height(16.dp))

        if (temperatura > 5) {
            Text(text = "¡Alerta! Temperatura elevada", color = Color.Red)
        }

        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { navController?.navigateUp() }) {
            Text("Volver")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MonitorTemperaturaScreenPreview() {
    MonitorTemperaturaScreen()
}
