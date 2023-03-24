package com.anncode.gridbuttonlibrary

import androidx.compose.ui.graphics.Color

class ButtonDecorator(
    override val text: String,
    override val colors: Pair<Color, Color>,
    override val onClick: () -> Unit,
) : GridButtonConfiguration