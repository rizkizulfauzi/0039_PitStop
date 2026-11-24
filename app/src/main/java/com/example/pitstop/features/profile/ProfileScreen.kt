package com.example.pitstop.features.profile
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pitstop.ui.components.PitStopBottomBar
import com.example.pitstop.ui.theme.*
@Composable fun ProfileScreen(){Scaffold(bottomBar={PitStopBottomBar("Profil"){} }){p->Column(Modifier.padding(p).padding(16.dp)){Text("Profil",color=PitStopNavy,style=MaterialTheme.typography.headlineMedium);Text("Rizki Zulfauzi",style=MaterialTheme.typography.titleLarge);Text("Admin",color=PitStopOrange);listOf("Ubah Profil","Ganti Password","Pengaturan Aplikasi","Tentang Aplikasi","Keluar").forEach{TextButton({}){Text(it)}}}}}
