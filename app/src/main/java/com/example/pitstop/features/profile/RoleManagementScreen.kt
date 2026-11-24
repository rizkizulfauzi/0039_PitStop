package com.example.pitstop.features.profile
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pitstop.ui.components.PitStopTopBar
import com.example.pitstop.ui.theme.*
@Composable fun RoleManagementScreen(){Column(Modifier.fillMaxSize().padding(horizontal=20.dp)){PitStopTopBar("Pengguna & Role");Text("Kelola akses pengguna",color=PitStopMuted);LazyColumn{items(listOf("Rizki Zulfauzi" to "Admin","Budi Mekanik" to "Mekanik")){(name,role)->Card(Modifier.fillMaxWidth().padding(vertical=6.dp)){Row(Modifier.padding(16.dp).fillMaxWidth(),horizontalArrangement=Arrangement.SpaceBetween){Text(name,color=PitStopNavy);Text(role,color=PitStopOrange)}}}}}}