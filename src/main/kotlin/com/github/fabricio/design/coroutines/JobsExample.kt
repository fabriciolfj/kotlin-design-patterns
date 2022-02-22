package com.github.fabricio.design.coroutines

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import java.util.UUID

class JobsExample {
}

fun main() {
    runBlocking {
        val job : Deferred<UUID> = fastUUidAsync()
        println(job.await())
    }
}

fun fastUUidAsync()  = GlobalScope.async { UUID.randomUUID() }