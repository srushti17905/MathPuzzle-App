package com.example.my_math_puzzle

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.my_shayari_app.Res
import com.example.my_shayari_app.levelbackground
import com.example.my_shayari_app.selectbutton
import org.jetbrains.compose.resources.painterResource

@Composable
fun level() {
    Surface(modifier = Modifier.fillMaxSize())
    {
        Image(
            painter = painterResource(Res.drawable.levelbackground),
            contentDescription = null,
            contentScale = ContentScale.FillBounds
        )
    }

}