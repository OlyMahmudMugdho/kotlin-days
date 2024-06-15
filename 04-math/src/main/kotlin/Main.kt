package com.mahmud

import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.round
import kotlin.math.sqrt

fun main() {
    println("the value of pi is ${kotlin.math.PI}")
    println("formated and precised ${String.format("%.4f", kotlin.math.PI)}")

    val num = 36F;
    println("root of $num is ${sqrt(num)}")

    val fraction : Float = 5.40F;
    println("fraction rounded to ${round(fraction)}")

    println("fraction floor to ${floor(fraction)}")


    println("fraction ceil to ${ceil(fraction)}")

}