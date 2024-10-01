package com.distribucion.distribucionprototipo.ui.theme
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun AgregarProductosScreen(navController: NavController) {
    val productos = listOf("Producto 1", "Producto 2", "Producto 3")
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Agregar Productos")
        Spacer(modifier = Modifier.height(16.dp))
        productos.forEach { producto ->
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(text = producto)
                Spacer(modifier = Modifier.weight(1f))
                Button(onClick = { /* Simular agregar producto */ }) {
                    Text(text = "Agregar")
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
        }

        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { navController.navigateUp() }) {
            Text("Volver")
        }
    }
}
