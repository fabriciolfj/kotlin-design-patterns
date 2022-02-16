package com.github.fabricio.design.funcional

class MainFuncoesDentroDeFuncoes {
}

fun main() {
    var next = counter()
    println(next())
    println(next())
    println(next())
}

fun counter(): () -> Int {
    var i = 0
    return { i++ }
}