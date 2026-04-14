package com.example.graduationcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.graduationcard.ui.theme.GraduationCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GraduationCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingText(
                        message = "Happy Graduation Katon",
                        sender = "From Birawa",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, sender : String, modifier : Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(8.dp)
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(Color(0xFF6A5ACD), Color(0xFFFF69B4)),
                    start = Offset(0f, 0f),
                    end = Offset(1000f, 1000f)
                )
            )

    ){

        Text(
            text = message,
            fontSize = 74.sp,
            lineHeight = 110.sp,
            textAlign = TextAlign.Center

        )


        Text(
            text = sender,
            fontSize = 28.sp,
            modifier = Modifier.padding(16.dp).align(Alignment.End)
        )

        Text(
            text = "Semoga apa yang katon cita-citakan menjadi Software Engineer dapat tercapai, Amin",
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 24.dp, start = 16.dp, end = 16.dp)
        )
    }
}
@Preview(showBackground = false)
@Composable
fun GreetingPreview() {
    GraduationCardTheme {
        GreetingText("Happy Graduation Katon", sender = "From Birawa")
    }
}