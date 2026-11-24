package com.example.pitstop.features.common
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pitstop.ui.theme.*
@Composable fun LoadingState(){Column(Modifier.fillMaxWidth().padding(32.dp),horizontalAlignment=Alignment.CenterHorizontally){CircularProgressIndicator(color=PitStopOrange);Text("Memuat data...",color=PitStopMuted)}}
@Composable fun EmptyState(message:String="Tidak ada data"){Column(Modifier.fillMaxWidth().padding(32.dp),horizontalAlignment=Alignment.CenterHorizontally){Text("▢",fontSize=42.sp);Text(message,color=PitStopMuted);Button({}){Text("+ Tambah")}}}
@Composable fun ErrorState(onRetry:()->Unit={}){Column(Modifier.fillMaxWidth().padding(32.dp),horizontalAlignment=Alignment.CenterHorizontally){Text("Terjadi kesalahan",color=PitStopDanger);Text("Silakan coba lagi nanti");TextButton(onRetry){Text("Coba Lagi")}}}
@Composable fun DeleteDialog(onDismiss:()->Unit={},onDelete:()->Unit={}){AlertDialog(onDismissRequest=onDismiss,title={Text("Konfirmasi Hapus")},text={Text("Apakah Anda yakin ingin menghapus data ini?")},confirmButton={TextButton(onDelete){Text("Hapus",color=PitStopDanger)}},dismissButton={TextButton(onDismiss){Text("Batal")}})}
@Composable fun ExportSuccessDialog(onClose:()->Unit={}){AlertDialog(onDismissRequest=onClose,title={Text("Export Berhasil!")},text={Text("Data riwayat servis berhasil diexport ke file CSV.")},confirmButton={Button(onClose){Text("OK")}})}
