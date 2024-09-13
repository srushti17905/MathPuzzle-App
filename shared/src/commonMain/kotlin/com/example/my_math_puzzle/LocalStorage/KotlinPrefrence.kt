package com.example.my_math_puzzle.LocalStorage

// common side

expect class KotlinPrefrence(getcontext: Any?)

expect fun KotlinPrefrence.getInt(key : String,defualt : Int) : Int
expect fun KotlinPrefrence.putInt(key : String,value : Int)
