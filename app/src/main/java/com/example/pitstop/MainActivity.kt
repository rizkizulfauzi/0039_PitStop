package com.example.pitstop
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.pitstop.ui.theme.PitStopTheme
class MainActivity:ComponentActivity(){override fun onCreate(savedInstanceState:Bundle?){super.onCreate(savedInstanceState);setContent{PitStopTheme{PitStopApp()}}}}
