package com.github.fabricio.design.buffer

import kotlinx.coroutines.channels.actor
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

//com buffer é mais rápido
class Simulacao

fun main() {

    runBlocking {
        val actor = actor<Long>(capacity = 10) {
            var prev = 0L
            channel.consumeEach {
                println(it - prev)
                prev = it
                delay(100)
            }
        }

        repeat(10) {
            actor.send(System.currentTimeMillis())
        }
    }
}