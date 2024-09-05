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
import com.example.my_shayari_app.leval1
import com.example.my_shayari_app.leval10
import com.example.my_shayari_app.leval11
import com.example.my_shayari_app.leval12
import com.example.my_shayari_app.leval13
import com.example.my_shayari_app.leval14
import com.example.my_shayari_app.leval15
import com.example.my_shayari_app.leval16
import com.example.my_shayari_app.leval17
import com.example.my_shayari_app.leval18
import com.example.my_shayari_app.leval19
import com.example.my_shayari_app.leval2
import com.example.my_shayari_app.leval20
import com.example.my_shayari_app.leval21
import com.example.my_shayari_app.leval22
import com.example.my_shayari_app.leval23
import com.example.my_shayari_app.leval24
import com.example.my_shayari_app.leval25
import com.example.my_shayari_app.leval27
import com.example.my_shayari_app.leval28
import com.example.my_shayari_app.leval29
import com.example.my_shayari_app.leval3
import com.example.my_shayari_app.leval30
import com.example.my_shayari_app.leval31
import com.example.my_shayari_app.leval32
import com.example.my_shayari_app.leval33
import com.example.my_shayari_app.leval34
import com.example.my_shayari_app.leval35
import com.example.my_shayari_app.leval36
import com.example.my_shayari_app.leval37
import com.example.my_shayari_app.leval38
import com.example.my_shayari_app.leval39
import com.example.my_shayari_app.leval4
import com.example.my_shayari_app.leval40
import com.example.my_shayari_app.leval41
import com.example.my_shayari_app.leval42
import com.example.my_shayari_app.leval43
import com.example.my_shayari_app.leval44
import com.example.my_shayari_app.leval45
import com.example.my_shayari_app.leval46
import com.example.my_shayari_app.leval47
import com.example.my_shayari_app.leval48
import com.example.my_shayari_app.leval49
import com.example.my_shayari_app.leval5
import com.example.my_shayari_app.leval50
import com.example.my_shayari_app.leval51
import com.example.my_shayari_app.leval52
import com.example.my_shayari_app.leval53
import com.example.my_shayari_app.leval54
import com.example.my_shayari_app.leval55
import com.example.my_shayari_app.leval56
import com.example.my_shayari_app.leval57
import com.example.my_shayari_app.leval58
import com.example.my_shayari_app.leval59
import com.example.my_shayari_app.leval6
import com.example.my_shayari_app.leval60
import com.example.my_shayari_app.leval61
import com.example.my_shayari_app.leval62
import com.example.my_shayari_app.leval63
import com.example.my_shayari_app.leval64
import com.example.my_shayari_app.leval65
import com.example.my_shayari_app.leval66
import com.example.my_shayari_app.leval67
import com.example.my_shayari_app.leval68
import com.example.my_shayari_app.leval69
import com.example.my_shayari_app.leval7
import com.example.my_shayari_app.leval70
import com.example.my_shayari_app.leval71
import com.example.my_shayari_app.leval72
import com.example.my_shayari_app.leval73
import com.example.my_shayari_app.leval74
import com.example.my_shayari_app.leval75
import com.example.my_shayari_app.leval8
import com.example.my_shayari_app.leval9
import com.example.my_shayari_app.plainyellowbutton
import com.example.my_shayari_app.whiteline
import com.example.my_shayari_app.whitepage
import org.jetbrains.compose.resources.painterResource

val star2 = mutableStateOf("")
var cc : Int = 0


class BordPage : Screen {
    @Composable
    override fun Content() {

        val navigator2 = LocalNavigator.current
        var ar = arrayOf(
            Res.drawable.leval1,
            Res.drawable.leval2,
            Res.drawable.leval3,
            Res.drawable.leval4,
            Res.drawable.leval5,
            Res.drawable.leval6,
            Res.drawable.leval7,
            Res.drawable.leval7,
            Res.drawable.leval8,
            Res.drawable.leval9,
            Res.drawable.leval10,
            Res.drawable.leval11,
            Res.drawable.leval12,
            Res.drawable.leval13,
            Res.drawable.leval14,
            Res.drawable.leval15,
            Res.drawable.leval16,
            Res.drawable.leval17,
            Res.drawable.leval18,
            Res.drawable.leval19,
            Res.drawable.leval20,
            Res.drawable.leval21,
            Res.drawable.leval22,
            Res.drawable.leval23,
            Res.drawable.leval24,
            Res.drawable.leval25,
            Res.drawable.leval27,
            Res.drawable.leval28,
            Res.drawable.leval29,
            Res.drawable.leval30,
            Res.drawable.leval31,
            Res.drawable.leval32,
            Res.drawable.leval33,
            Res.drawable.leval34,
            Res.drawable.leval35,
            Res.drawable.leval36,
            Res.drawable.leval37,
            Res.drawable.leval38,
            Res.drawable.leval39,
            Res.drawable.leval40,
            Res.drawable.leval41,
            Res.drawable.leval42,
            Res.drawable.leval43,
            Res.drawable.leval44,
            Res.drawable.leval45,
            Res.drawable.leval46,
            Res.drawable.leval47,
            Res.drawable.leval48,
            Res.drawable.leval49,
            Res.drawable.leval50,
            Res.drawable.leval51,
            Res.drawable.leval52,
            Res.drawable.leval53,
            Res.drawable.leval54,
            Res.drawable.leval55,
            Res.drawable.leval56,
            Res.drawable.leval57,
            Res.drawable.leval58,
            Res.drawable.leval59,
            Res.drawable.leval60,
            Res.drawable.leval61,
            Res.drawable.leval62,
            Res.drawable.leval63,
            Res.drawable.leval64,
            Res.drawable.leval65,
            Res.drawable.leval66,
            Res.drawable.leval67,
            Res.drawable.leval68,
            Res.drawable.leval69,
            Res.drawable.leval70,
            Res.drawable.leval71,
            Res.drawable.leval72,
            Res.drawable.leval73,
            Res.drawable.leval74,
            Res.drawable.leval75
            )

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
                    squear1("Level 1")
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
                        painter = painterResource(ar[56]),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier.height(350.dp).width(320.dp)
                    )
                cc++
            }
            Row(modifier = Modifier.fillMaxSize().weight(.8f))
            {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.fillMaxSize().weight(.8f)
                ) {
                    Row (modifier = Modifier.fillMaxSize()){  }
                    Image(
                        painter = painterResource(Res.drawable.whiteline),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier.height(50.dp).width(310.dp)
                    )
                    Text(text = s, fontSize = 30.sp, color = Color.Black)
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

