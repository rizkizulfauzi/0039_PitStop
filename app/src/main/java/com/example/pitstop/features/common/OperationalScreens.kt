package com.example.pitstop.features.common
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pitstop.ui.components.PitStopTopBar
import com.example.pitstop.ui.theme.*
@Composable fun StockMovementScreen(){Column(Modifier.fillMaxSize().padding(horizontal=20.dp)){PitStopTopBar("Pergerakan Stok");Text("Riwayat perubahan stok",color=PitStopMuted);LazyColumn{items(listOf("Stok masuk · Oli Mesin · +20","Pemakaian servis · Filter Oli · -1","Koreksi stok · Kampas Rem · +5")){Card(Modifier.fillMaxWidth().padding(vertical=6.dp)){Column(Modifier.padding(16.dp)){Text(it,color=PitStopNavy);Text("24 Nov 2026",color=PitStopMuted)}}}}}}
@Composable fun JobAttributesScreen(){Column(Modifier.fillMaxSize().padding(horizontal=20.dp)){PitStopTopBar("Detail Atribut Servis");listOf("Keluhan pelanggan","Diagnosa mekanik","Tindakan perbaikan","Catatan tambahan").forEach{OutlinedTextField("",{},Modifier.fillMaxWidth().padding(vertical=5.dp),label={Text(it)})};Button({},Modifier.fillMaxWidth().padding(top=12.dp)){Text("Simpan Detail")}}}
@Composable fun ReportScreen(){Column(Modifier.fillMaxSize().padding(horizontal=20.dp)){PitStopTopBar("Laporan");Text("Ringkasan periode",color=PitStopMuted);listOf("Total servis 124","Pendapatan Rp 8.400.000","Sparepart terpakai 238").forEach{Card(Modifier.fillMaxWidth().padding(vertical=6.dp)){Text(it,color=PitStopNavy,modifier=Modifier.padding(16.dp))}};Button({},Modifier.fillMaxWidth().padding(top=12.dp),colors=ButtonDefaults.buttonColors(containerColor=PitStopOrange)){Text("Export CSV")}}}