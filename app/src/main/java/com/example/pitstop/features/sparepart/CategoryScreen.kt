package com.example.pitstop.features.sparepart
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pitstop.ui.components.PitStopTopBar
import com.example.pitstop.ui.theme.*
@Composable fun CategoryScreen(){Column(Modifier.fillMaxSize().padding(16.dp)){PitStopTopBar("Kategori");OutlinedTextField("",{},Modifier.fillMaxWidth(),placeholder={Text("Cari kategori...")});LazyColumn{items(listOf("Oli" to 12,"Rem" to 8,"Filter" to 6,"Busi" to 4,"Lainnya" to 3)){(name,count)->Card(Modifier.fillMaxWidth().padding(vertical=5.dp)){Row(Modifier.padding(16.dp).fillMaxWidth(),horizontalArrangement=Arrangement.SpaceBetween){Text(name,color=PitStopNavy);Text("$count item",color=PitStopMuted)}}}}}}
