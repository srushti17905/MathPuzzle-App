package com.example.my_math_puzzle

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
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
import com.example.my_shayari_app.levelbackground
import com.example.my_shayari_app.levelbluebutton
import com.example.my_shayari_app.levellock
import com.example.my_shayari_app.levelselectbutton
import com.example.my_shayari_app.right
import org.jetbrains.compose.resources.painterResource

var add = 1

class LevelPage(var level: Int) : Screen {
    @Composable
    override fun Content() {

        var navigator = LocalNavigator.current

        Surface(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(Res.drawable.levelbackground),
                contentDescription = null,
                contentScale = ContentScale.FillBounds
            )
        }

        Column(modifier = Modifier.fillMaxSize()) {

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize().weight(.1f)
            ) {
                Image(
                    painter = painterResource(Res.drawable.levelselectbutton),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier.height(60.dp).width(210.dp)
                )
            }

            Row(modifier = Modifier.fillMaxSize().weight(1f)) {
                LazyVerticalGrid(columns = GridCells.Fixed(4), content = {
                    items(75) {
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier.fillMaxSize().weight(1f).padding(top = 20.dp)
                        ) {


                            Image(
                                painter = painterResource(Res.drawable.levelbluebutton),
                                contentDescription = null,
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier.height(60.dp).width(60.dp).clickable {
                                    navigator!!.replace(BordPage(it))
                                }
                            )
                            Text(text = "${it + 1}", fontSize = 30.sp, color = Color.White)

//                            if () {
                                Image(
                                    painter = painterResource(Res.drawable.right),
                                    contentDescription = null,
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier.height(40.dp).width(40.dp)
                                )

//                            } else {

                                Image(
                                    painter = painterResource(Res.drawable.levellock),
                                    contentDescription = null,
                                    contentScale = ContentScale.FillBounds,
                                    modifier = Modifier.height(40.dp).width(40.dp)
                                )
                            }
                        }

//                    }
                }
                )
            }

        }
    }
}