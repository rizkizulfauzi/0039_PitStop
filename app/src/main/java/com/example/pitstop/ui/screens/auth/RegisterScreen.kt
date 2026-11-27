package com.example.pitstop.ui.screens.auth
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pitstop.ui.components.PitStopLogo
import com.example.pitstop.ui.theme.*
@Composable fun RegisterScreen(onRegister:()->Unit,onBack:()->Unit){Column(Modifier.fillMaxSize().padding(horizontal=22.dp),horizontalAlignment=Alignment.CenterHorizontally,verticalArrangement=Arrangement.Center){TextButton(onBack,Modifier.align(Alignment.Start)){Text("‹",color=PitStopNavy,style=MaterialTheme.typography.headlineMedium)};PitStopLogo();Text("Daftar Akun",color=PitStopNavy,style=MaterialTheme.typography.headlineSmall);Text("Buat akun baru untuk melanjutkan",color=PitStopNavy);Spacer(Modifier.height(20.dp));AuthField("Nama Lengkap");Spacer(Modifier.height(8.dp));AuthField("Email");Spacer(Modifier.height(8.dp));AuthField("Password",true);Spacer(Modifier.height(8.dp));AuthField("Konfirmasi Password",true);Spacer(Modifier.height(14.dp));AuthButton("Daftar",orange=true,onClick=onRegister);TextButton(onBack){Text("Sudah punya akun? ");Text("Masuk",color=PitStopOrange)}}}
