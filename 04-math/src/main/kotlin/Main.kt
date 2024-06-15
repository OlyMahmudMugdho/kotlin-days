package com.mahmud

import kotlin.math.sqrt

fun main() {
    println("the value of pi is ${kotlin.math.PI}")
    println("formated and precised ${String.format("%.4f", kotlin.math.PI)}")

    val num = 36F;
    println("root of $num is ${sqrt(num)}")
}