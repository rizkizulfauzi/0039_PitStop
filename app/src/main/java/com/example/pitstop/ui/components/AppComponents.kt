package com.example.pitstop.ui.components
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pitstop.ui.theme.*
@Composable fun PitStopTopBar(title:String){Text(title,color=PitStopNavy,style=MaterialTheme.typography.titleLarge,modifier=Modifier.padding(16.dp))}
@Composable fun PitStopBottomBar(selected:String,onSelect:(String)->Unit){NavigationBar{listOf("Beranda","Sparepart","Servis","Pelanggan","Profil").forEach{item->NavigationBarItem(selected==item,{onSelect(item)},icon={},label={Text(item)})}}}
@Composable fun KpiCard(title:String,value:String){Card(Modifier.width(160.dp)){Column(Modifier.padding(16.dp)){Text(title,color=PitStopMuted);Text(value,color=PitStopNavy,style=MaterialTheme.typography.headlineMedium)}}}
