package com.example.pitstop.features.auth
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pitstop.ui.theme.*
@Composable fun SplashScreen(onContinue:()->Unit){Column(Modifier.fillMaxSize().background(PitStopNavy).padding(24.dp),horizontalAlignment=Alignment.CenterHorizontally,verticalArrangement=Arrangement.Center){Text("PitStop",color=PitStopOrange,fontSize=42.sp,fontWeight=FontWeight.Bold);Text("Solusi Bengkel, Dalam Satu Aplikasi",color=MaterialTheme.colorScheme.onPrimary);Spacer(Modifier.height(32.dp));Button(onContinue){Text("Mulai")}}}
