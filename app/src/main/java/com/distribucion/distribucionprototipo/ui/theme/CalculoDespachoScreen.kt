package com.distribucion.distribucionprototipo.ui.theme
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun CalculoDespachoScreen(navController: NavController) {
    var totalCompra by remember { mutableStateOf("") }
    var distancia by remember { mutableStateOf("") }
    var costoDespacho by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Cálculo de Despacho")
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = totalCompra,
            onValueChange = { totalCompra = it },
            label = { Text(text = "Total de la compra") }
        )
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = distancia,
            onValueChange = { distancia = it },
            label = { Text(text = "Distancia en km") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            costoDespacho = calcularDespacho(totalCompra.toIntOrNull() ?: 0, distancia.toIntOrNull() ?: 0)
        }) {
            Text(text = "Calcular Despacho")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Costo de Despacho: $costoDespacho CLP")

        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { navController.navigateUp() }) {
            Text("Volver")
        }
    }
}

fun calcularDespacho(totalCompra: Int, distancia: Int): Int {
    return when {
        totalCompra >= 50000 -> 0  // Despacho gratis
        totalCompra in 25000..49999 -> 150 * distancia  // $150 por km
        else -> 300 * distancia  // $300 por km
    }
}
