package com.example.pitstop.ui.screens.dashboard
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pitstop.ui.components.PitStopTopBar
import com.example.pitstop.ui.theme.*
@Composable fun NotificationScreen(){Column(Modifier.fillMaxSize().padding(horizontal=20.dp)){PitStopTopBar("Notifikasi");LazyColumn{items(listOf("Stok Filter Oli menipis","Export riwayat servis berhasil","Servis Honda Beat selesai")){Card(Modifier.fillMaxWidth().padding(vertical=6.dp)){Column(Modifier.padding(16.dp)){Text(it,color=PitStopNavy);Text("Hari ini",color=PitStopMuted)}}}}}}