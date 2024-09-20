package com.example.my_math_puzzle.LocalStorage

// ios side

actual class KotlinPrefrence actual constructor(getcontext: Any?)

actual fun KotlinPrefrence.getInt(key: String, defualt: Int): Int {
    return 0
}

actual fun KotlinPrefrence.putInt(key: String, value: Int) {}
actual fun KotlinPrefrence.getString(
    key: String, default: String
): String? {
    return ""
}

actual fun KotlinPrefrence.putString(
    key: String, value: String
) {
}