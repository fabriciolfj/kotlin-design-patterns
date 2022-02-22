package com.github.fabricio.design.threads

import kotlin.concurrent.thread

class ExampleDaemon {
}
//thread daemon quando a thread pai termina, as filhas tb terminam
fun main() {
    thread(isDaemon = true) {
        for (i in 1 .. 100) {
            println(i)
        }
    }
}