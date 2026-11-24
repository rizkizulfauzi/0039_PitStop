package com.example.pitstop.features.service
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pitstop.ui.components.PitStopTopBar
import com.example.pitstop.ui.theme.*
@Composable fun ServiceDetailScreen(){Column(Modifier.fillMaxSize().padding(horizontal=20.dp)){PitStopTopBar("Detail Servis");Card(Modifier.fillMaxWidth()){Column(Modifier.padding(18.dp)){Text("Ganti Oli",color=PitStopNavy,style=MaterialTheme.typography.titleLarge);Text("Honda Beat · AB 1234 CD",color=PitStopMuted);Text("Selesai",color=PitStopOrange)}};Text("Pelanggan",color=PitStopMuted,modifier=Modifier.padding(top=18.dp));Text("Budi Santoso",color=PitStopNavy);Text("Sparepart",color=PitStopMuted,modifier=Modifier.padding(top=18.dp));Text("Oli Mesin 10W-40 · Qty 1",color=PitStopNavy);Button({},Modifier.fillMaxWidth().padding(top=24.dp)){Text("Ubah Status")}}}