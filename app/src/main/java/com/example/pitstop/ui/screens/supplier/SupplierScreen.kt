package com.example.pitstop.ui.screens.supplier
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pitstop.ui.components.*
import com.example.pitstop.ui.theme.*
@Composable fun SupplierScreen(onNavigate:(String)->Unit={}){var q by remember{mutableStateOf("")};val data=listOf("PT Sumber Jaya" to "supplier@sumberjaya.id","CV Auto Parts Indonesia" to "0812-9988-7766","Bengkel Makmur Supply" to "sales@makmursupply.id");Scaffold(bottomBar={PitStopBottomBar("Sparepart",onNavigate)},floatingActionButton={FloatingActionButton({},containerColor=PitStopOrange){Text("+")}}){p->Column(Modifier.padding(p).padding(horizontal=20.dp)){PitStopTopBar("Supplier");Text("Kelola pemasok sparepart",color=PitStopMuted);Spacer(Modifier.height(10.dp));OutlinedTextField(q,{q=it},Modifier.fillMaxWidth().height(52.dp),placeholder={Text("Cari supplier...")},singleLine=true,shape=androidx.compose.foundation.shape.RoundedCornerShape(12.dp));Spacer(Modifier.height(10.dp));LazyColumn{items(data.filter{it.first.contains(q,true)}){(name,contact)->Card(Modifier.fillMaxWidth().padding(vertical=5.dp)){Column(Modifier.padding(16.dp)){Text(name,color=PitStopNavy,style=MaterialTheme.typography.titleMedium);Text(contact,color=PitStopMuted);Text("3 sparepart",color=PitStopOrange)}}}}}}}
