package com.example.checkinternet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.ExperimentalCoroutinesApi

class MainActivity : ComponentActivity() {
    @ExperimentalCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen()
        }
    }
}

@ExperimentalCoroutinesApi
@Composable
fun HomeScreen(){

    val connection by connectivityState()

    Column(
        Modifier.fillMaxSize(),
        Arrangement.Center,
        Alignment.CenterHorizontally
    ){
        if(connection == ConnectionState.Available)
            Text(
                "Back to Online!",
                fontSize = 25.sp,
                fontWeight = FontWeight.W600,
                color = Color.DarkGray
            )
        else
            Text(
                "No Internet Connection!",
                fontSize = 25.sp,
                fontWeight = FontWeight.W600,
                color = Color.Red
            )
    }

}



