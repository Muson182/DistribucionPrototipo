package com.distribucion.distribucionprototipo.ui.theme
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun EstadoDespachoScreen(navController: NavController) {
    val estado = "En camino"  // Estado simulado

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Estado del Despacho")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Su pedido está: $estado")

        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { navController.navigateUp() }) {
            Text("Volver")
        }
    }
}
