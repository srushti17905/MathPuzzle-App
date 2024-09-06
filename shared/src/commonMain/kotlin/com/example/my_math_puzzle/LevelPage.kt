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
import com.example.my_shayari_app.levelbluebutton
import com.example.my_shayari_app.levelselectbutton
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

    Column(modifier = Modifier.fillMaxSize()) {

        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize().weight(1f)) {

            Image(
                painter = painterResource(Res.drawable.levelselectbutton),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.height(65.dp).width(220.dp)
            )
        }

}
}
