package com.example.pitstop.ui.screens.profile
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pitstop.ui.components.*
import com.example.pitstop.ui.theme.*
@Composable fun ProfileScreen(onNavigate:(String)->Unit={}){Scaffold(bottomBar={PitStopBottomBar("Profil",onNavigate) }){p->Column(Modifier.padding(p).padding(horizontal=20.dp),horizontalAlignment=Alignment.CenterHorizontally){PitStopTopBar("Profil");Card(Modifier.fillMaxWidth()){Column(Modifier.fillMaxWidth().padding(20.dp),horizontalAlignment=Alignment.CenterHorizontally){PitStopLogo(Modifier.size(72.dp));Text("Rizki Zulfauzi",color=PitStopNavy,style=MaterialTheme.typography.titleLarge);Text("Admin",color=PitStopOrange);Text("Kelola profil akun Anda",color=PitStopMuted)}};Spacer(Modifier.height(16.dp));listOf("Ubah Profil","Ganti Password","Pengaturan Aplikasi","Tentang Aplikasi").forEach{TextButton({},Modifier.fillMaxWidth()){Text(it,color=PitStopNavy)}};TextButton({},Modifier.fillMaxWidth()){Text("Keluar",color=PitStopDanger)}}}}