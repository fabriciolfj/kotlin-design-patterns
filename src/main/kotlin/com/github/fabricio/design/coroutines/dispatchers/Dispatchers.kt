package com.github.fabricio.design.coroutines.dispatchers

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//executar o processo em outras threads
fun main() {
    curtaDuracao()
    longaDuracao()
}

fun longaDuracao() = runBlocking {
    launch(Dispatchers.IO) {
        println(Thread.currentThread().name)
    }
}

fun curtaDuracao() = runBlocking {
    launch(Dispatchers.Default) {
        println(Thread.currentThread().name)
    }
}