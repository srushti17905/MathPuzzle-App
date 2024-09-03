package com.example.my_math_puzzle.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.my_math_puzzle.BordPage
import com.example.my_math_puzzle.HomePage
import com.example.my_math_puzzle.level
import com.example.my_math_puzzle.myapplication
import com.example.my_math_puzzle.win

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
            myapplication()
            }
        }
    }
}


