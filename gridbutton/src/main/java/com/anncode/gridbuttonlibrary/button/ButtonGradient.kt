package com.anncode.gridbuttonlibrary.button

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ButtonGradient(
    text: String,
    colors: Pair<Color, Color>,
    onClick: () -> Unit
) {
    val sizeModifier = Modifier.height(100.dp).width(100.dp)
    Button(
        contentPadding = PaddingValues(),
        onClick = { onClick() },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent)
        //modifier = sizeModifier
    ) {
        Box(
            modifier = sizeModifier.background(
                Brush.sweepGradient(
                    0.1f to colors.first, //Color.Magenta,
                    1.0f to colors.second, //Color.Cyan,
                    center = Offset.Infinite
                )
            ),
            contentAlignment = Alignment.Center
        ) {
            Text(text = text)
        }
        
    }
}

@Preview
@Composable
fun ShowingGradientButton() {
    ButtonGradient(text = "Hola", Pair(Color.Magenta, Color.Cyan)) {


    }
}