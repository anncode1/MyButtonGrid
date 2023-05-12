package com.anncode.mybuttongrid

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.anncode.gridbuttonlibrary.ButtonDecorator
import com.anncode.gridbuttonlibrary.GridButton
import com.anncode.mybuttongrid.ui.theme.MyButtonGridTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyButtonGridTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column() {
                        val buttons = getButtonDecorators()
                        GridButton(buttons = buttons, 3)
                    }
                }
            }
        }
    }

    private fun getButtonDecorators() = listOf(
        ButtonDecorator(
            "Home",
            Pair(Color(0xFFDD5E89), Color(0xFFF7BB97))
        ) { Toast.makeText(this@MainActivity, "Home", Toast.LENGTH_SHORT).show() },
        ButtonDecorator(
            "My Profile",
            Pair(Color(0xFFB80F87), Color(0xFFF5B1D5))
        ) { Toast.makeText(this@MainActivity, "My Profile", Toast.LENGTH_SHORT).show() },
        ButtonDecorator(
            "My Bag",
            Pair(Color(0xFFDE6262), Color(0xFFFFB88C))
        ) { Toast.makeText(this@MainActivity, "My Bag", Toast.LENGTH_SHORT).show() },
        ButtonDecorator(
            "Wish List",
            Pair(Color(0xFFB80F87), Color(0xFFF5B1D5))
        ) { Toast.makeText(this@MainActivity, "Wish List", Toast.LENGTH_SHORT).show() },
        ButtonDecorator(
            "Browse",
            Pair(Color(0xFFF2709C), Color(0xFFFF9472))
        ) { Toast.makeText(this@MainActivity, "Browse", Toast.LENGTH_SHORT).show() },
        ButtonDecorator(
            "Navigator",
            Pair(Color(0xFFB80F87), Color(0xFFF5B1D5))
        ) { Toast.makeText(this@MainActivity, "Navigator", Toast.LENGTH_SHORT).show() }
    )
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyButtonGridTheme {
        Greeting("Android")
    }
}