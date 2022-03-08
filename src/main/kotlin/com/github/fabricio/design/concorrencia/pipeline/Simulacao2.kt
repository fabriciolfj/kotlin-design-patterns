package com.github.fabricio.design.concorrencia.pipeline

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

class Simulacao2

fun main() {
    runBlocking {
        val nf = produceNf()
        val pgto = producePagamento(nf)
        val itens = produceSeparacaoItens(pgto)

        itens.consumeEach { println(it) }
    }

}


fun CoroutineScope.produceNf() = produce {
    val nf = Nf(false, true, false)
    send(nf)
}

fun CoroutineScope.producePagamento(channel: ReceiveChannel<Nf>) = produce {

    fun update(nf: Nf) = Nf(Random.nextBoolean(), nf.autorizada, nf.itensSeparados)

    for (p in channel)
        send(update(p))
}

fun CoroutineScope.produceSeparacaoItens(channel: ReceiveChannel<Nf>) = produce {

    fun update(nf: Nf) = Nf(nf.pagamento, nf.autorizada, Random.nextBoolean())

    for (p in channel)
        send(update(p))
}

data class Nf(val pagamento: Boolean, val autorizada: Boolean, val itensSeparados: Boolean)