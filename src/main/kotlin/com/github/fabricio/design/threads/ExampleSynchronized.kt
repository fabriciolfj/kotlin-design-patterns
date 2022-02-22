package com.github.fabricio.design.threads

import java.util.concurrent.CountDownLatch
import kotlin.concurrent.thread

class ExampleSynchronized

fun main() {
    val latch = CountDownLatch(100_00)//garantir que a thread completou seu trabalho, antes de verificar o valor
    var count = 0
    thread {
        repeat(1000) {
            synchronized(latch) {
                count++
                latch.countDown()
            }
        }
    }
}