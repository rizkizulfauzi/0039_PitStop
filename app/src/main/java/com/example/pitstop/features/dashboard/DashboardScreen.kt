package com.example.pitstop.features.dashboard
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pitstop.ui.components.*
import com.example.pitstop.ui.theme.*
@Composable fun DashboardScreen(){Scaffold(bottomBar={PitStopBottomBar("Beranda"){} }){pad->Column(Modifier.padding(pad).fillMaxSize().padding(16.dp)){PitStopTopBar("Beranda");Text("Halo, Admin 👋",color=PitStopNavy,style=MaterialTheme.typography.headlineSmall);Text("Kelola bengkel Anda dengan mudah",color=PitStopMuted);Row(Modifier.padding(vertical=16.dp),horizontalArrangement=Arrangement.spacedBy(8.dp)){KpiCard("Servis Hari Ini","5");KpiCard("Stok Menipis","3")};Text("Ringkasan",style=MaterialTheme.typography.titleLarge);KpiCard("Total Servis","124");KpiCard("Total Pelanggan","89");KpiCard("Total Sparepart","452");Text("Servis Terbaru",style=MaterialTheme.typography.titleLarge,modifier=Modifier.padding(top=16.dp));Card(Modifier.fillMaxWidth()){Column(Modifier.padding(16.dp)){Text("Honda Beat · Budi Santoso");Text("Ganti Oli · Selesai",color=PitStopMuted)}}}}}
