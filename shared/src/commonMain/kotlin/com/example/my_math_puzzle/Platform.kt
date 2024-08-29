package com.example.my_math_puzzle

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform