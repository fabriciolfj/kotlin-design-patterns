package com.github.fabricio.design.canalefluxos.produtores

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Simulacao

fun main() {
    runBlocking {
        val chan = GlobalScope.produce {
            (1..10).forEach {
                send(it)
            }
        }

        GlobalScope.launch {
            delay(100)
            chan.consumeEach {
                imprimir(it)
            }
        }
    }
}

fun imprimir(value: Int) {
    println(value)
}