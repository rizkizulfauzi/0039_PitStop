package com.example.pitstop.ui.components
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import com.example.pitstop.ui.theme.*
@Composable fun PitStopTopBar(title:String){Row(Modifier.fillMaxWidth().padding(bottom=12.dp),horizontalArrangement=Arrangement.SpaceBetween){Row{PitStopLogo(Modifier.size(44.dp));Text(title,color=PitStopNavy,style=MaterialTheme.typography.titleLarge,modifier=Modifier.padding(start=10.dp,top=10.dp))};Badge{Text("3")}}}
@Composable fun PitStopBottomBar(selected:String,onSelect:(String)->Unit){NavigationBar(containerColor=PitStopNavy){listOf("Beranda","Sparepart","Servis","Pelanggan","Profil").forEach{item->NavigationBarItem(selected==item,{onSelect(item)},icon={},label={Text(item)},colors=NavigationBarItemDefaults.colors(selectedIconColor=PitStopOrange,selectedTextColor=PitStopOrange,unselectedTextColor=Color.White.copy(alpha=.7f)))}}}
@Composable fun KpiCard(title:String,value:String,modifier:Modifier=Modifier){Card(modifier.fillMaxWidth()){Column(Modifier.padding(16.dp)){Text(title,color=PitStopMuted);Text(value,color=PitStopNavy,style=MaterialTheme.typography.headlineMedium)}}}
