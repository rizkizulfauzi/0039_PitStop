package com.example.pitstop.features.vehicle
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pitstop.ui.components.PitStopTopBar
import com.example.pitstop.ui.theme.*
@Composable fun VehicleDetailScreen(){Column(Modifier.fillMaxSize().padding(16.dp)){PitStopTopBar("Detail Kendaraan");Card(Modifier.fillMaxWidth()){Column(Modifier.padding(20.dp)){Text("Honda Beat",style=MaterialTheme.typography.headlineSmall,color=PitStopNavy);Text("AB 1234 CD · Motor",color=PitStopOrange)}};Text("Spesifikasi",style=MaterialTheme.typography.titleLarge,modifier=Modifier.padding(top=20.dp));Text("Tahun        2022");Text("Warna        Hitam");Text("No. Rangka   MH1JFZ123456");Text("No. Mesin    JFZ123456");Text("Riwayat Servis",style=MaterialTheme.typography.titleLarge,modifier=Modifier.padding(top=20.dp));Text("Ganti Oli · 24 Nov 2026 · Rp 150.000 · Selesai");Button({},Modifier.fillMaxWidth().padding(top=20.dp)){Text("Edit Kendaraan")}}}
