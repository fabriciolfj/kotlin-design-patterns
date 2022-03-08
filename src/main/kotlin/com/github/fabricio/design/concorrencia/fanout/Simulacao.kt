package com.github.fabricio.design.concorrencia.fanout

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//varios coroutine lendo o mesmo canal
class Simulacao

fun main() {
    runBlocking {
        val emails = envioEmail()
        executando(emails)
    }
}

fun CoroutineScope.executando(channel: ReceiveChannel<String>) = launch {

    for (e in channel) {
        println(e)
    }
}

fun CoroutineScope.envioEmail() = produce {
    val lista = listOf("teste1", "teste2", "teste3")

    lista.forEach { send(it) }
}