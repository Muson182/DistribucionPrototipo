package com.distribucion.distribucionprototipo.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Bienvenido a la Pantalla Principal")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("tracking") }) {
            Text(text = "Ir al seguimiento")
        }
    }
}
