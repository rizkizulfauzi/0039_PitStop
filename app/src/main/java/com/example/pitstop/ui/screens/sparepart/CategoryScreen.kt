package com.example.pitstop.ui.screens.sparepart
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pitstop.ui.components.PitStopTopBar
import com.example.pitstop.ui.theme.*
@Composable fun CategoryScreen(){Column(Modifier.fillMaxSize().padding(horizontal=20.dp)){PitStopTopBar("Kategori");Text("Kelola kategori sparepart",color=PitStopMuted);Spacer(Modifier.height(10.dp));OutlinedTextField("",{},Modifier.fillMaxWidth().height(52.dp),placeholder={Text("Cari kategori...")},singleLine=true,shape=androidx.compose.foundation.shape.RoundedCornerShape(12.dp));LazyColumn{items(listOf("Oli" to 12,"Rem" to 8,"Filter" to 6,"Busi" to 4,"Lainnya" to 3)){(name,count)->Card(Modifier.fillMaxWidth().padding(vertical=5.dp)){Row(Modifier.padding(16.dp).fillMaxWidth(),horizontalArrangement=Arrangement.SpaceBetween){Text(name,color=PitStopNavy);Text("$count item",color=PitStopMuted)}}}}}}
