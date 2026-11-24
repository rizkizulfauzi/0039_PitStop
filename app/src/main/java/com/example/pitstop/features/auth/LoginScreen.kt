package com.example.pitstop.features.auth
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pitstop.ui.theme.PitStopNavy
import com.example.pitstop.ui.components.PitStopLogo
@Composable fun LoginScreen(onLogin:()->Unit,onRegister:()->Unit){var remember by remember{mutableStateOf(false)};Column(Modifier.fillMaxSize().padding(24.dp),verticalArrangement=Arrangement.Center){PitStopLogo();PitStopLogo();Text("PitStop",color=PitStopNavy,style=MaterialTheme.typography.headlineLarge);Text("Masuk ke Akun Anda",style=MaterialTheme.typography.headlineSmall);Text("Kelola bengkel Anda dengan mudah");Spacer(Modifier.height(20.dp));OutlinedTextField("",{},Modifier.fillMaxWidth(),label={Text("Email atau Username")});OutlinedTextField("",{},Modifier.fillMaxWidth(),label={Text("Password")});Row(Modifier.fillMaxWidth(),horizontalArrangement=Arrangement.SpaceBetween){Row{Checkbox(remember,{remember=!remember});Text("Ingat Saya")};TextButton({}){Text("Lupa Password?")}};Button(onLogin,Modifier.fillMaxWidth()){Text("Masuk")};OutlinedButton({},Modifier.fillMaxWidth().padding(top=8.dp)){Text("Masuk dengan Google")};TextButton(onRegister,Modifier.fillMaxWidth()){Text("Belum punya akun? Daftar")}}}
