package com.example.pitstop.features.auth
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pitstop.ui.components.PitStopLogo
import com.example.pitstop.ui.theme.*
@Composable fun ForgotPasswordScreen(onBack:()->Unit={}){Column(Modifier.fillMaxSize().padding(22.dp),verticalArrangement=Arrangement.Center){PitStopLogo();Text("Lupa Password?",color=PitStopNavy,style=MaterialTheme.typography.headlineSmall);Text("Masukkan email untuk menerima tautan reset",color=PitStopMuted);Spacer(Modifier.height(18.dp));OutlinedTextField("",{},Modifier.fillMaxWidth(),label={Text("Email")});Spacer(Modifier.height(14.dp));Button({},Modifier.fillMaxWidth(),colors=ButtonDefaults.buttonColors(containerColor=PitStopOrange)){Text("Kirim Tautan")};TextButton(onBack){Text("Kembali ke Login",color=PitStopOrange)}}}