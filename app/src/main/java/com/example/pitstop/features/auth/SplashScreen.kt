package com.example.pitstop.features.auth
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import com.example.pitstop.ui.components.PitStopLogo
import com.example.pitstop.ui.theme.*
@Composable fun SplashScreen(onContinue:()->Unit){Column(Modifier.fillMaxSize().background(Color.White).padding(horizontal=24.dp),horizontalAlignment=Alignment.CenterHorizontally,verticalArrangement=Arrangement.Center){PitStopLogo(Modifier.width(175.dp));Spacer(Modifier.height(24.dp));Text("Solusi Bengkel,",color=PitStopNavy,fontSize=18.sp);Text("Dalam Satu Aplikasi",color=PitStopNavy,fontSize=18.sp);Spacer(Modifier.height(44.dp));Row(horizontalArrangement=Arrangement.spacedBy(6.dp)){repeat(4){Box(Modifier.size(if(it==0)7.dp else 5.dp).background(if(it==0)PitStopNavy else BorderBlue,androidx.compose.foundation.shape.CircleShape))}};Spacer(Modifier.height(20.dp));TextButton(onContinue){Text("Mulai",color=PitStopOrange)}}}