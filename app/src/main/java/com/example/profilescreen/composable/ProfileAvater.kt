package com.example.profilescreen.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.profilescreen.R

@Composable
fun ProfileAvatar(painter:Painter){
    Image(
        painter =painter,
        contentDescription = "Profile Picture",
        modifier = Modifier.size(width = 170.dp, height = 174.dp).padding(end = 30.dp)
    )
}