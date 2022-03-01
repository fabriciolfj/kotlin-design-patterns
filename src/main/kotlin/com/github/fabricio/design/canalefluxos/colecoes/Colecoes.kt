package com.github.fabricio.design.canalefluxos.colecoes

import com.github.fabricio.design.canalefluxos.colecoes.Colecoes.Companion.numbers

class Colecoes {
    companion object {
        val numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7)
    }
}

fun main() {
    //println(operadorOnEach(numbers))
    //println(somar((numbers)))
    achatar()
}

fun achatar() {
    val list = listOf(listOf(1,2), listOf(3, 4), listOf(5, 6))
    val newList = list.flatten()
    println(newList)
}

fun somar(numbers: List<Int>) : Int {
    return numbers.reduce { sum, n -> n + sum  }
}

fun operadorOnEach(numbers: List<Int>) : List<Int> {
    return numbers.map { it * it }
            .filter { it < 20 }
            .sortedDescending()
            .onEach { println(it) } //retorna algum
            .filter { it > 5 }
}