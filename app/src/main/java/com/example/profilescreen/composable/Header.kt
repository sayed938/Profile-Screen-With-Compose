package com.example.profilescreen.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Header(text:String){
    Text(text = text, fontSize = 20.sp, modifier = Modifier.padding(end=30.dp))
}