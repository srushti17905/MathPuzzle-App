package com.example.my_math_puzzle.LocalStorage

import android.content.Context
import android.content.SharedPreferences

// in android side

actual class KotlinPrefrence actual constructor(var getcontext: Any?) {

    init {
//        edit.putInt()
//        edit.putString()
//        edit.putBoolean()

//        sp.getInt()
//        sp.getString()
//        sp.getBoolean()
    }

    // data get
    var sp: SharedPreferences =
        (getcontext as Context).getSharedPreferences("sp", Context.MODE_PRIVATE)

    // data set
    var edit: SharedPreferences.Editor = sp.edit()


}

actual fun KotlinPrefrence.getInt(key: String, defualt: Int): Int {
    return sp.getInt(key, defualt)
}

actual fun KotlinPrefrence.putInt(key: String, value: Int) {
    edit.putInt(key, value)
    edit.apply()
}