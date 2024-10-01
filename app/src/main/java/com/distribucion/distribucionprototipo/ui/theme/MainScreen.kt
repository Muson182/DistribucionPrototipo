package com.distribucion.distribucionprototipo.ui.theme
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MainScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Bienvenido a DistribuciónApp")
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { navController.navigate("monitorTemperatura") }) {
            Text("Monitoreo de Temperatura")
        }
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = { navController.navigate("calculoDespacho") }) {
            Text("Cálculo de Transporte")
        }
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = { navController.navigate("agregarProductos") }) {
            Text("Agregar Productos")
        }
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = { navController.navigate("estadoDespacho") }) {
            Text("Estado de Despacho")
        }
    }
}

