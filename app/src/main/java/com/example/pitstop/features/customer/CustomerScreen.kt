package com.example.pitstop.features.customer
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pitstop.ui.components.*
import com.example.pitstop.ui.theme.*
@Composable fun CustomerScreen(){var q by remember{mutableStateOf("")};val data=listOf("Budi Santoso" to "0812-3456-7890","Ahmad Wijaya" to "0857-1111-2222","Siti Nurhaliza" to "0821-3333-4444","Andi Pratama" to "0813-5555-6666");Scaffold(bottomBar={PitStopBottomBar("Pelanggan"){}},floatingActionButton={FloatingActionButton({},containerColor=PitStopOrange){Text("+")}}){p->Column(Modifier.padding(p).padding(horizontal=20.dp)){PitStopTopBar("Pelanggan");Text("Kelola data pelanggan dan kendaraan",color=PitStopMuted);Spacer(Modifier.height(10.dp));OutlinedTextField(q,{q=it},Modifier.fillMaxWidth().height(52.dp),placeholder={Text("Cari pelanggan...")},singleLine=true,shape=androidx.compose.foundation.shape.RoundedCornerShape(12.dp));LazyColumn{items(data.filter{it.first.contains(q,true)}){(name,phone)->Card(Modifier.fillMaxWidth().padding(vertical=5.dp)){Column(Modifier.padding(16.dp)){Text(name,color=PitStopNavy);Text(phone,color=PitStopMuted);Text("2 kendaraan",color=PitStopOrange,fontSize=12.sp)}}}}}}}
