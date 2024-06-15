package com.mahmud

fun main() {
    var name = "Mugdho";
    println("Hello, $name");
    println(name.uppercase())
    println(name.lowercase())
    var emptytext = "";
    val blankText = " "


    if (emptytext.isEmpty()) {
        println("text is empty")
    }
    if (blankText.isBlank()) {
        println("text is blank")
    }

    println("hello ${name.uppercase()}")

}