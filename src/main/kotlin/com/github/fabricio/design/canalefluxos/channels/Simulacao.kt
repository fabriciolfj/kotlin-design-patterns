package com.github.fabricio.design.canalefluxos.channels

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


//comunicação entre threads
class Simulacao

suspend fun main() {
    runBlocking {
        val chan = Channel<Int>()

        GlobalScope.launch {
            for (c in chan) {
                println(c)
            }
        }

        (1..10).forEach { chan.send(it) }

        chan.close()
    }

}