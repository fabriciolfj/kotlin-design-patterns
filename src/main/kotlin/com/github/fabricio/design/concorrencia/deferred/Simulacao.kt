package com.github.fabricio.design.concorrencia.deferred

import kotlinx.coroutines.*
import java.lang.RuntimeException
import kotlin.random.Random

//quando pegamos o valor de uma promessa futura
class Simulacao

fun main() {
    runBlocking {
        val value = valueAsync()
        println(value.await())
    }
}

suspend fun valueAsync() : Deferred<String> = coroutineScope {
    val deferred = CompletableDeferred<String>()

    launch {
        delay(100)
        if (Random.nextBoolean()) {
            deferred.complete("ok")
        } else {
            deferred.completeExceptionally(RuntimeException())
        }
    }

    deferred
}