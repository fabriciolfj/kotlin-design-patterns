package com.github.fabricio.design.coroutines

import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield


fun main() = runBlocking {
    val cancellable = launch {
        try {
            for (i in 1..1000) {
                println("Cancellable: $i")
                yield() //verifique se mais alguem queira realizar algum trabalho, caso queria outro coroutine assumirá se não a atual continuará o processo
            }
        } catch (e: CancellationException) {
            e.printStackTrace()
        }
    }

    val notCancellable = launch {
        for (i in 1..10_000) {
            if (i % 100 == 0) {
                println("Not cancellable $i")
            }
        }
    }

    println("Canceling cancellable")
    cancellable.cancel()
    println("Canceling not cancellable")
    notCancellable.cancel()

    cancellable.join() //esperar a execução do coroutine completar
    notCancellable.join()
}