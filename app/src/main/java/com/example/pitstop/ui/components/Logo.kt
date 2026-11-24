package com.example.pitstop.ui.components
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.size
import com.example.pitstop.R
@Composable fun PitStopLogo(modifier: Modifier = Modifier){Image(painterResource(R.drawable.pitstop_logo),"Logo PitStop",modifier.size(150.dp),contentScale=ContentScale.Fit)}
