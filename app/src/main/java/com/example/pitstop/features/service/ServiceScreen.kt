package com.example.pitstop.features.service
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pitstop.ui.components.*
import com.example.pitstop.ui.theme.*
import androidx.compose.ui.graphics.Color
@Composable fun ServiceScreen(){Scaffold(bottomBar={PitStopBottomBar("Servis"){}},floatingActionButton={FloatingActionButton({},containerColor=PitStopOrange){Text("+")}}){p->Column(Modifier.padding(p).padding(16.dp)){PitStopTopBar("Riwayat Servis");Row(Modifier.fillMaxWidth(),horizontalArrangement=Arrangement.SpaceBetween){FilterChip(selected=true,onClick={},label={Text("Semua")});TextButton({}){Text("📅 Kalender")}};LazyColumn{items(listOf("Ganti Oli · Honda Beat" to "Selesai","Servis Rem · Yamaha NMAX" to "Proses","Tune Up · Suzuki Satria" to "Selesai")){(title,status)->Card(Modifier.fillMaxWidth().padding(vertical=5.dp)){Row(Modifier.padding(16.dp).fillMaxWidth(),horizontalArrangement=Arrangement.SpaceBetween){Column{Text(title,color=PitStopNavy);Text("24 Nov 2026 · Rp 150.000",color=PitStopMuted)};AssistChip({},label={Text(status)},colors=AssistChipDefaults.assistChipColors(containerColor=if(status=="Proses")PitStopOrange.copy(alpha=.2f) else Color(0xFFE5F3E9)))}}}}}}}
@Composable fun ServiceForm(){Column(Modifier.padding(16.dp)){PitStopTopBar("Form Servis");OutlinedTextField("Budi Santoso",{},Modifier.fillMaxWidth(),label={Text("Pelanggan")});OutlinedTextField("Honda Beat · AB 1234 CD",{},Modifier.fillMaxWidth(),label={Text("Kendaraan")});OutlinedTextField("",{},Modifier.fillMaxWidth(),label={Text("Jenis Servis *")});Text("Sparepart Digunakan",style=MaterialTheme.typography.titleMedium);TextButton({}){Text("+ Tambah")};OutlinedTextField("",{},Modifier.fillMaxWidth(),label={Text("Catatan (Opsional)")});Button({},Modifier.fillMaxWidth()){Text("Simpan Servis")}}}
