package com.example.my_math_puzzle

import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.FadeTransition
import cafe.adriel.voyager.transitions.SlideTransition

var context : Any? = null

@Composable
fun transition(getcontext: Any? = null)
{

    context = getcontext
    Navigator(HomePage()){ navigator ->


        SlideTransition(navigator = navigator , animationSpec = tween(1000))
//        FadeTransition(navigator = navigator , animationSpec = tween(3000))

    }
}
