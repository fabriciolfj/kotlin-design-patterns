package com.github.fabricio.design.concorrencia.racing

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.selects.select
import kotlin.random.Random

//tenho varios workes trabalhando simulataneamente, e pego o primeiro que retornar o resultado
class Simulacao

fun main() {
    runBlocking {
        while (true) {
            val winner = select<String> {
                findProdutoByGoogle().onReceive { google -> google }
                findProductByAWS().onReceive { aws -> aws } }
            println(winner)
            delay(1000)
        }
    }
}

fun CoroutineScope.findProdutoByGoogle() = produce<String> {
    delay(Random.nextLong(100))
    send("google")
}

fun CoroutineScope.findProductByAWS() = produce {
    delay(Random.nextLong(100))
    send("aws")
}