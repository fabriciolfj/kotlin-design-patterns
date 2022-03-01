package com.github.fabricio.design.coroutines.concorrenciaestruturada

import kotlinx.coroutines.*

class StructuredConcurrency

//por padrão, uma thread pai aguarda as threads filhas concluirem seu trabalho
//quando uma thread filha lança uma exeção, a thread pai cancela as demais que ainda não foram chamadas e ela tb é cancelada
//para não cancelar a thread pai, quando alguma thread filha lança exceção, utilizamos a palavra reservada supervisorScope

fun main() {

}

fun execute() = runBlocking {
    launch(Dispatchers.Default) {
        supervisorScope {
            val filha = List(10) { childId ->
                launch {
                    for (i in 1..1_000) {
                        if (i % 100 == 0) {
                            println("$childId - $i'")
                            yield()
                        }

                    }
                }
            }
        }
    }
}
