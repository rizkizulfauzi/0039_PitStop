package com.example.pitstop.features.vehicle
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pitstop.ui.components.PitStopTopBar
import com.example.pitstop.ui.theme.*
@Composable fun VehicleFormScreen(){Column(Modifier.fillMaxSize().padding(horizontal=20.dp)){PitStopTopBar("Tambah Kendaraan");listOf("Pelanggan *","Merk dan Model *","Nomor Polisi *","Tahun","Warna","Nomor Rangka","Nomor Mesin").forEach{OutlinedTextField("",{},Modifier.fillMaxWidth().padding(vertical=3.dp),label={Text(it)})};Button({},Modifier.fillMaxWidth().padding(top=10.dp),colors=ButtonDefaults.buttonColors(containerColor=PitStopOrange)){Text("Simpan Kendaraan")}}}