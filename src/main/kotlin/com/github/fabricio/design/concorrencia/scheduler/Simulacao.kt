package com.github.fabricio.design.concorrencia.scheduler

import kotlinx.coroutines.*

//desacopla o que esta sendo executado a partir de como ele esta sendo executado
//exemplo os dispatchers
class Simulacao


fun main() {
    runBlocking {
            async(Dispatchers.IO) {
                for (i in 1..1000) {
                    println(Thread.currentThread().name)
                    yield()
                }
            }

    }
}