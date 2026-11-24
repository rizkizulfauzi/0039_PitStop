package com.example.pitstop.ui.components
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.pitstop.R
@Composable fun PitStopLogo(modifier: Modifier = Modifier){Image(painterResource(R.drawable.pitstop_logo),"Logo PitStop",modifier,contentScale=ContentScale.Fit)}
