package com.example.my_math_puzzle

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import com.example.my_shayari_app.Res
import com.example.my_shayari_app.background
import com.example.my_shayari_app.bluebutton
import com.example.my_shayari_app.mail
import com.example.my_shayari_app.purple
import com.example.my_shayari_app.redbutton
import com.example.my_shayari_app.share
import com.example.my_shayari_app.yellowbutton
import org.jetbrains.compose.resources.painterResource

class HomePage : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current

        Surface(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(Res.drawable.background),
                contentDescription = null,
                contentScale = ContentScale.FillBounds
            )
        }

        Column(modifier = Modifier.fillMaxSize()) {

            Row(modifier = Modifier.fillMaxSize().weight(2.8f)) {}

            Box(
                contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()
                    .weight(.7f)
            ) {
                Image(
                    painter = painterResource(Res.drawable.yellowbutton),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.height(60.dp).width(170.dp).clickable
                    {
                        navigator!!.push(BordPage())
                    }
                )
                button("PLAY")
            }
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()
                    .weight(.7f)
            ) {
                Image(
                    painter = painterResource(Res.drawable.bluebutton),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.height(60.dp).width(170.dp).clickable {
                        navigator!!.push(LevelPage())
                    }
                )
                button("LEVEL")
            }
            Box(
                contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()
                    .weight(.7f)
            ) {
                Image(
                    painter = painterResource(Res.drawable.redbutton),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.height(60.dp).width(170.dp)
                )
                button("BUY PRO")
            }
            Row(modifier = Modifier.fillMaxSize().weight(1f)) {}

            Row(modifier = Modifier.fillMaxSize().weight(.8f))
            {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize().weight(.4f)
                ) {
                    Image(
                        painter = painterResource(Res.drawable.share),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier.height(40.dp).width(40.dp)
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize().weight(.7f)
                ) {
                    Image(
                        painter = painterResource(Res.drawable.purple),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier.height(40.dp).width(120.dp)
                    )
                    button1("Privacy Policy")
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize().weight(.4f)
                ) {
                    Image(
                        painter = painterResource(Res.drawable.mail),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier.height(40.dp).width(40.dp)
                    )
                }
            }
        }
    }
}


@Composable
fun button(text: String) {
    Text(text = text, fontSize = 40.sp, color = Color.White)
}

@Composable
fun button1(text: String) {
    Text(text = text, fontSize = 20.sp, color = Color.White)
}

