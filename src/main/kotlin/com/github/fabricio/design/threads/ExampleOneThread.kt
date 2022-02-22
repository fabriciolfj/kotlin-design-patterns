package com.github.fabricio.design.threads

import kotlin.concurrent.thread

class ExampleOneThread {
}

fun main() {
    repeat(2) { t ->
        thread { for ( i in 1.. 100) {
            println("T$t : $i")
        } }
    }
}