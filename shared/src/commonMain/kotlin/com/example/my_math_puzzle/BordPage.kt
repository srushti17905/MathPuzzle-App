package com.example.my_math_puzzle

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsEndWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import com.example.my_shayari_app.Res
import com.example.my_shayari_app.background2
import com.example.my_shayari_app.backspace
import com.example.my_shayari_app.backspacebutton
import com.example.my_shayari_app.button1
import com.example.my_shayari_app.button2
import com.example.my_shayari_app.plainyellowbutton
import com.example.my_shayari_app.whiteline
import com.example.my_shayari_app.whitepage
import org.jetbrains.compose.resources.painterResource

class BordPage : Screen {
    @Composable
    override fun Content() {

        val navigator2 = LocalNavigator.current

        Surface(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(Res.drawable.background2),
                contentDescription = null,
                contentScale = ContentScale.FillBounds
            )
        }
        Column(modifier = Modifier.fillMaxSize()) {

            Row(modifier = Modifier.fillMaxSize().weight(.8f)) {

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize().weight(.5f)
                ) {
                    Image(
                        painter = painterResource(Res.drawable.button1),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier.height(50.dp).width(50.dp)
                    )
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize().weight(1.5f)
                ) {
                    squear1("Puzzle 1")
                }
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize().weight(.5f)
                ) {
                    Image(
                        painter = painterResource(Res.drawable.button2),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier.height(50.dp).width(50.dp)
                    )
                }
            }
            Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize().weight(4f)) {

                Image(
                    painter = painterResource(Res.drawable.whitepage),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.height(350.dp).width(320.dp)
                )
            }
            Row (modifier = Modifier.fillMaxSize().weight(.8f))
            {

                     Box(
                         contentAlignment = Alignment.Center,
                         modifier = Modifier.fillMaxSize().weight(.8f)
                     ) {
                        Image(
                              painter = painterResource(Res.drawable.whiteline),
                              contentDescription = null,
                              contentScale = ContentScale.FillBounds,
                              modifier = Modifier.height(50.dp).width(310.dp)
                        )
                    Text(text = s, fontSize = 30.sp, color = Color.Black)

//                    Image(
//                        painter = painterResource(Res.drawable.backspace),
//                        contentDescription = null,
//                        contentScale = ContentScale.FillBounds,
//                        modifier = Modifier.height(30.dp).width(30.dp)
//                    )
                }
            }
            Row(modifier = Modifier.fillMaxSize().weight(.7f))
            {
                Row(modifier = Modifier.fillMaxSize().weight(.1f)) { }

                Row(modifier = Modifier.fillMaxSize().weight(1f))
                {
                    image(this, "1")
                    image(this, "2")
                    image(this, "3")
                    image(this, "4")
                    image(this, "5")
                }
                Row(modifier = Modifier.fillMaxSize().weight(.1f)) { }
            }
            Row(modifier = Modifier.fillMaxSize().weight(.7f)) {

                Row(modifier = Modifier.fillMaxSize().weight(.1f)) { }

                Row(modifier = Modifier.fillMaxSize().weight(1f))
                {
                    image(this, "6")
                    image(this, "7")
                    image(this, "8")
                    image(this, "9")
                    image(this, "0")
                }
                Row(modifier = Modifier.fillMaxSize().weight(.1f)) { }
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize().weight(1.1f).clickable {
                    navigator2!!.push(win())
                }
            ) {
                squear2("SUBMIT")
            }
        }
    }
}

@Composable
fun squear1(text: String) {
    Surface(
        modifier = Modifier.height(50.dp).width(150.dp),
        color = Color.Black,
        border = BorderStroke(3.dp, color = moon.skyblue),
        shape = RoundedCornerShape(15.dp)
    ) {
        Box(contentAlignment = Alignment.Center) {
            Text(text = text, fontSize = 30.sp, color = Color.Yellow)
        }
    }
}


@Composable
fun squear2(text: String) {
    Surface(
        modifier = Modifier.height(60.dp).width(180.dp),
        color = Color.Black,
        border = BorderStroke(3.dp, color = moon.skyblue),
        shape = RoundedCornerShape(20.dp)
    ) {
        Box(contentAlignment = Alignment.Center) {
            Text(text = text, fontSize = 35.sp, color = Color.White)
        }
    }
}

val sky = mutableStateOf("")
val s by sky

@Composable
fun image(rowScope: RowScope, text: String) {
    rowScope.apply {
        Box(contentAlignment = Alignment.Center, modifier = Modifier.weight(1f))
        {
            Image(
                painter = painterResource(Res.drawable.plainyellowbutton),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.height(60.dp).width(60.dp).padding(4.dp).clickable {
                    if (text == "1") {
                        sky.value += "1"
                    } else if (text == "2") {
                        sky.value += "2"
                    } else if (text == "3") {
                        sky.value += "3"
                    } else if (text == "4") {
                        sky.value += "4"
                    } else if (text == "5") {
                        sky.value += "5"
                    } else if (text == "6") {
                        sky.value += "6"
                    } else if (text == "7") {
                        sky.value += "7"
                    } else if (text == "8") {
                        sky.value += "8"
                    } else if (text == "9") {
                        sky.value += "9"
                    } else if (text == "0") {
                        sky.value += "0"
                    } else {
                        sky.value += text
                    }
                }
            )
            Text(text = text, fontSize = 35.sp, color = Color.Black)
        }
    }
}

