package com.example.profilescreen.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InfoCard(modifier: Modifier, text: String, onTextChange: (String) -> Unit) {

    Box(modifier) {
        Card(
            modifier = Modifier
                .size(height = 44.dp, width = 330.dp),
            shape = RoundedCornerShape(6.dp)
        ) {
            Box(modifier = Modifier.padding(vertical = 12.dp, horizontal = 10.dp)) {
                BasicTextField(value = text, onValueChange = onTextChange)
            }
        }
    }
}