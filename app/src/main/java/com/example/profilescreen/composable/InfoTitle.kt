package com.example.profilescreen.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun InfoTitle(modifier:Modifier,name:String){
    Box(modifier) {
        Text(text = name, fontSize = 16.sp)
    }
}