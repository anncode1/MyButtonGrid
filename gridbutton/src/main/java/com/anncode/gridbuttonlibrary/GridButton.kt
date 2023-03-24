package com.anncode.gridbuttonlibrary

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.anncode.gridbuttonlibrary.button.ButtonGradient

@Composable
fun GridButton(
    buttons : List<GridButtonConfiguration>,
    columnsNumber: Int
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(columnsNumber),
        modifier = Modifier.padding(10.dp)
    ) {
        items(buttons.size) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(5.dp)
            ) {
                ButtonGradient(
                    text = buttons[it].text,
                    colors = buttons[it].colors
                ) {
                    buttons[it].onClick()
                }
            }
        }
    }
}

