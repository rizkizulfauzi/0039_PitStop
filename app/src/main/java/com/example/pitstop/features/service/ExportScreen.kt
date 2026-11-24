package com.example.pitstop.features.service
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pitstop.ui.components.PitStopTopBar
@Composable fun ExportScreen(){var done by remember{mutableStateOf(false)};Column(Modifier.fillMaxSize().padding(16.dp)){PitStopTopBar("Export Laporan");Text("Data riwayat servis akan diexport ke file CSV.");Button({done=true},Modifier.fillMaxWidth().padding(top=20.dp)){Text("Export CSV")};if(done)AlertDialog(onDismissRequest={done=false},title={Text("Export Berhasil!")},text={Text("Data riwayat servis berhasil diexport ke file CSV.")},confirmButton={Button({done=false}){Text("OK")}})}}
