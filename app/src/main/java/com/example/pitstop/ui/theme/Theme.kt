package com.example.pitstop.ui.theme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
private val PitStopScheme=lightColorScheme(primary=PitStopOrange,secondary=PitStopNavy,background=PitStopBackground)
@Composable fun PitStopTheme(content:@Composable ()->Unit){MaterialTheme(colorScheme=PitStopScheme,content=content)}
