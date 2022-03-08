package com.github.fabricio.design.concorrencia.fanin

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//varios coroutine escrevendo no mesmo canal
class Simulacao

fun main() {
    runBlocking {
        val channel = Channel<Int>()
        numeros2(channel)
        numeros3(channel)

        channel.consumeEach { println(it) }
    }
}

fun CoroutineScope.numeros2(channel: Channel<Int>) = async {
    val num = listOf(1,2,3)
    num.forEach { channel.send(it) }
}


fun CoroutineScope.numeros3(channel: Channel<Int>) = async {
    val num = listOf(4,5,6)
    num.forEach { channel.send(it) }
}
