package com.github.fabricio.design.canalefluxos.sequencia

import kotlin.system.measureTimeMillis

class Simulacao

fun main() {
    val numbers = (1..1_000_000).toList()
    println(measureTimeMillis {
        numbers.map { it * it }
                .take(1)
                .forEach { it }
    })

    println(measureTimeMillis {
        numbers.asSequence().map { it * it }
                .take(1)
                .forEach { it }
    })
}