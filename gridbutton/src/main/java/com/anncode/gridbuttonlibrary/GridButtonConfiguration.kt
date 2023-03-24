package com.anncode.gridbuttonlibrary

import androidx.compose.ui.graphics.Color

interface GridButtonConfiguration  {
    val colors: Pair<Color, Color>
    val text: String
    val onClick: () -> Unit
}