package com.example.pitstop.features.auth
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pitstop.ui.theme.*
@Composable fun AuthField(label:String,password:Boolean=false){OutlinedTextField(value="",onValueChange={},modifier=Modifier.fillMaxWidth().height(54.dp),placeholder={Text(label,fontSize=12.sp)},singleLine=true,shape=RoundedCornerShape(12.dp),visualTransformation=if(password)PasswordVisualTransformation() else androidx.compose.ui.text.input.VisualTransformation.None,colors=OutlinedTextFieldDefaults.colors(unfocusedBorderColor=BorderBlue,focusedBorderColor=PitStopOrange,unfocusedContainerColor=Color.White))}
@Composable fun AuthButton(text:String,orange:Boolean=false,onClick:()->Unit={}){Button(onClick,modifier=Modifier.fillMaxWidth().height(48.dp),shape=RoundedCornerShape(13.dp),colors=ButtonDefaults.buttonColors(containerColor=if(orange)PitStopOrange else PitStopNavy)){Text(text,fontSize=14.sp)}}
