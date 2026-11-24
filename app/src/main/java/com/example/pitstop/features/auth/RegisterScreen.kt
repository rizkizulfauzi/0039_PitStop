package com.example.pitstop.features.auth
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
@Composable fun RegisterScreen(onRegister:()->Unit,onBack:()->Unit){Column(Modifier.fillMaxSize().padding(24.dp),verticalArrangement=Arrangement.Center){Text("Daftar Akun",style=MaterialTheme.typography.headlineMedium);Text("Buat akun baru untuk melanjutkan");listOf("Nama Lengkap","Email","Password","Konfirmasi Password").forEach{OutlinedTextField("",{},Modifier.fillMaxWidth().padding(vertical=4.dp),label={Text(it)})};Button(onRegister,Modifier.fillMaxWidth().padding(top=12.dp)){Text("Daftar")};TextButton(onBack){Text("Sudah punya akun? Masuk")}}}
