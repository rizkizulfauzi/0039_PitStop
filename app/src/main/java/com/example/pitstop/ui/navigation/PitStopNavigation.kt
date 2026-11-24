package com.example.pitstop.ui.navigation
import androidx.compose.runtime.*
import com.example.pitstop.features.auth.*
import com.example.pitstop.ui.theme.PitStopTheme
private enum class Route{Splash,Login,Register}
@Composable fun PitStopNavigation(){var route by remember{mutableStateOf(Route.Splash)};PitStopTheme{when(route){Route.Splash->SplashScreen{route=Route.Login};Route.Login->LoginScreen({},{route=Route.Register});Route.Register->RegisterScreen({route=Route.Login},{route=Route.Login})}}}
