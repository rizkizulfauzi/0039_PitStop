package com.example.pitstop.features.customer
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pitstop.ui.components.PitStopTopBar
import com.example.pitstop.ui.theme.*
@Composable fun CustomerFormScreen(){Column(Modifier.fillMaxSize().padding(horizontal=20.dp)){PitStopTopBar("Tambah Pelanggan");listOf("Nama Lengkap *","Nomor Telepon *","Email","Alamat").forEach{OutlinedTextField("",{},Modifier.fillMaxWidth().padding(vertical=5.dp),label={Text(it)})};Button({},Modifier.fillMaxWidth().padding(top=12.dp),colors=ButtonDefaults.buttonColors(containerColor=PitStopOrange)){Text("Simpan Pelanggan")}}}