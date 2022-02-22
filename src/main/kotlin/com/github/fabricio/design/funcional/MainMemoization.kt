package com.github.fabricio.design.funcional

class MainMemoization {
}

fun main() {
    val input = listOf(
            setOf(1, 2, 3),
            setOf(3, 2, 1),
            setOf(2, 3, 1),
            setOf(4, 5, 6),
    )

    val sum = summarizer()
    input.forEach {
        println(sum(it)) }
}


fun summarizer() : (Set<Int>) -> Double {
    val list = mutableMapOf<Set<Int>, Double>()
    return {
        numbers -> list.computeIfAbsent(numbers, ::sum)
    }
}

fun sum(numbers: Set<Int>): Double {
    println("Computing")
    return numbers.sumOf { it.toDouble() }
}