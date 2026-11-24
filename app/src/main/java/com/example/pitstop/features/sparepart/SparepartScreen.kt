package com.example.pitstop.features.sparepart
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pitstop.ui.components.*
import com.example.pitstop.ui.theme.*
@Composable fun SparepartScreen(){var q by remember{mutableStateOf("")};var low by remember{mutableStateOf(false)};val data=listOf("Oli Mesin 10W-40" to 12,"Kampas Rem" to 4,"Filter Oli" to 1,"Busi NGK" to 8);Scaffold(bottomBar={PitStopBottomBar("Sparepart"){}},floatingActionButton={FloatingActionButton({},containerColor=PitStopOrange){Text("+")}}){p->Column(Modifier.padding(p).padding(16.dp)){PitStopTopBar("Sparepart");Text("Kelola persediaan bengkel",color=PitStopMuted);OutlinedTextField(q,{q=it},Modifier.fillMaxWidth(),placeholder={Text("Cari sparepart...")});Row{FilterChip(selected=!low,onClick={low=false},label={Text("Semua")});Spacer(Modifier.width(8.dp));FilterChip(selected=low,onClick={low=true},label={Text("Stok Rendah")});TextButton({}){Text("Kategori") }};LazyColumn{items(data.filter{it.first.contains(q,true)&&( !low||it.second<5)}){(name,stock)->Card(Modifier.fillMaxWidth().padding(vertical=5.dp)){Row(Modifier.padding(16.dp).fillMaxWidth(),horizontalArrangement=Arrangement.SpaceBetween){Column{Text(name,color=PitStopNavy);Text("Rp 65.000",color=PitStopOrange)};Text("Stok $stock",color=if(stock<5)PitStopDanger else PitStopNavy)}}}}}}}
@Composable fun SparepartForm(){Column(Modifier.padding(16.dp)){PitStopTopBar("Tambah Sparepart");OutlinedTextField("",{},Modifier.fillMaxWidth(),label={Text("Nama Sparepart *")});OutlinedTextField("",{},Modifier.fillMaxWidth(),label={Text("Kategori *")});OutlinedTextField("",{},Modifier.fillMaxWidth(),label={Text("Harga *")});OutlinedTextField("",{},Modifier.fillMaxWidth(),label={Text("Stok *")});Button({},Modifier.fillMaxWidth()){Text("Simpan")}}}
