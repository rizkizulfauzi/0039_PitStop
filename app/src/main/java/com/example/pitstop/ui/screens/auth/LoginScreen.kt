package com.example.pitstop.ui.screens.auth
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pitstop.ui.components.PitStopLogo
import com.example.pitstop.ui.theme.*
@Composable fun LoginScreen(onLogin:()->Unit,onRegister:()->Unit){var remember by remember{mutableStateOf(false)};Column(Modifier.fillMaxSize().padding(horizontal=22.dp),horizontalAlignment=Alignment.CenterHorizontally,verticalArrangement=Arrangement.Center){PitStopLogo();Spacer(Modifier.height(16.dp));Text("Masuk ke Akun Anda",color=PitStopNavy,style=MaterialTheme.typography.headlineSmall);Text("Kelola bengkel Anda dengan mudah",color=PitStopNavy);Spacer(Modifier.height(22.dp));AuthField("Email atau Username");Spacer(Modifier.height(10.dp));AuthField("Password",true);Row(Modifier.fillMaxWidth(),horizontalArrangement=Arrangement.SpaceBetween,verticalAlignment=Alignment.CenterVertically){Row(verticalAlignment=Alignment.CenterVertically){Checkbox(remember,{remember=!remember});Text("Ingat Saya")};TextButton({}){Text("Lupa Password?",color=PitStopNavy)}};AuthButton("Masuk",onClick=onLogin);Text("atau masuk dengan",color=PitStopNavy,modifier=Modifier.padding(12.dp));OutlinedButton({},Modifier.fillMaxWidth().height(48.dp),shape=androidx.compose.foundation.shape.RoundedCornerShape(13.dp)){Text("G  Google",color=PitStopNavy)};TextButton(onRegister,Modifier.padding(top=12.dp)){Text("Belum punya akun? ");Text("Daftar",color=PitStopOrange)}}}
