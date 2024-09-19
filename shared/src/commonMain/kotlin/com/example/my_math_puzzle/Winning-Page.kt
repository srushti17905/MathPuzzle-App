package com.example.my_math_puzzle

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import com.example.my_shayari_app.Res
import com.example.my_shayari_app.bluebutton
import com.example.my_shayari_app.redbutton
import com.example.my_shayari_app.share
import com.example.my_shayari_app.winniglevelcomplete1
import com.example.my_shayari_app.winningbackground
import com.example.my_shayari_app.winninglogo
import com.example.my_shayari_app.yellowbutton
import org.jetbrains.compose.resources.painterResource


class win(var level : Int ) : Screen {
    @Composable
    override fun Content() {

        val navigator3 = LocalNavigator.current
        Surface(modifier = Modifier.fillMaxSize())
        {
            Image(
                painter = painterResource(Res.drawable.winningbackground),
                contentDescription = null,
                contentScale = ContentScale.FillBounds
            )
        }

        Column(modifier = Modifier.fillMaxSize())
        {
            Row(
                modifier = Modifier.fillMaxSize().weight(.7f),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment =
                Alignment.Bottom
            ) {
                Text(text = "${level}", fontSize = 60.sp, color = Color.White)
            }
            Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize().weight(.8f))
            {
                Image(
                    painter = painterResource(Res.drawable.winniglevelcomplete1),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.height(50.dp).width(210.dp)
                )
            }
            Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize().weight(3f))
            {
                Image(
                    painter = painterResource(Res.drawable.winninglogo),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.height(270.dp).width(420.dp)
                )
            }
            Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize().weight(1f))
            {
                Image(
                    painter = painterResource(Res.drawable.yellowbutton),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.height(60.dp).width(180.dp).clickable {
                        navigator3!!.push(BordPage(level))

                    }
                )
                winbutton("CONTINUE")
            }
            Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize().weight(1f))
            {
                Image(
                    painter = painterResource(Res.drawable.bluebutton),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.height(60.dp).width(180.dp).clickable {
                        navigator3!!.push(HomePage())
                    }
                )
                winbutton("MAIN MENU")

            }
            Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize().weight(1f))
            {
                Image(
                    painter = painterResource(Res.drawable.redbutton),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.height(60.dp).width(180.dp)
                )
                winbutton("BUY PRO")
            }
            Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize().weight(1f))
            {
                Image(
                    painter = painterResource(Res.drawable.share),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.height(50.dp).width(50.dp)
                )
            }
        }
    }
}

@Composable
fun winbutton(text: String) {
    Text(text = text, fontSize = 33.sp, color = Color.White)
}