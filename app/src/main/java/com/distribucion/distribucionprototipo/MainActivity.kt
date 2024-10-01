package com.distribucion.distribucionprototipo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.distribucion.distribucionprototipo.ui.theme.DistribucionPrototipoTheme
import com.distribucion.distribucionprototipo.ui.theme.LoginScreen
import com.distribucion.distribucionprototipo.ui.theme.HomeScreen
import com.distribucion.distribucionprototipo.ui.theme.TrackingScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DistribucionPrototipoTheme {
                // Controlador de la navegación
                val navController: NavHostController = rememberNavController()

                // Superficie general de la aplicación
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Configuración del host de navegación
                    NavHost(
                        navController = navController,
                        startDestination = "login"
                    ) {
                        // Pantalla de inicio de sesión
                        composable("login") {
                            LoginScreen(navController = navController)
                        }

                        // Pantalla principal (Home)
                        composable("home") {
                            HomeScreen(navController = navController)
                        }

                        // Pantalla de seguimiento y monitoreo
                        composable("tracking") {
                            TrackingScreen(navController = navController)
                        }
                    }
                }
            }
        }
    }
}
