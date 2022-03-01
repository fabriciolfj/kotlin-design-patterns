package com.github.fabricio.design.canalefluxos.actor

import kotlinx.coroutines.channels.actor
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.runBlocking

//actor é ligado a um channel
class Simulacao

fun main() {
    runBlocking {
        val actor = actor<Int> {
            channel.consumeEach {
                println(it)
            }
        }

        (1..10).forEach { actor.send(it) }
    }
}