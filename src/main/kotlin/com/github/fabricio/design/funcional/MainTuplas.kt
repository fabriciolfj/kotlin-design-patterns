package com.github.fabricio.design.funcional

class MainTuplas {
}

fun main() {
    val pair = "a" to 1

    println("${pair.first} ${pair.second}")

    val (key, value) = pair
    println("$key $value")
}