package com.github.fabricio.design.coroutines

import kotlinx.coroutines.TimeoutCancellationException
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.random.Random


fun main() = runBlocking {
    val coroutine = async {
        try {
            val time = Random.nextLong(1000)
            println("It will take me $time to do")
            delay(time)
            println("Return profile")
            "Profile"
        } catch (e: TimeoutCancellationException) {
            e.printStackTrace()
        }
    }

    println("Result: ${coroutine.await()}")
}