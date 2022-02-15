package com.github.fabricio.design.funcional

import kotlin.concurrent.thread

class MainThreads {
}

fun main() {
    val score =  arrayOf(0)
    val threads = List(2) {
        thread {
            for(i in 1..1000) {
                score[0] = score[0] + 1
            }
        }
    }

    for(t in threads) {
        t.join()
    }

    println(score[0])
}