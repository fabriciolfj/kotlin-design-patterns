package com.github.fabricio.design.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay

//quando uma função usa a palavra chave suspend, ela consegui atender mais requisições, não bloqueia nenhum segmento
class SuspendMain {
}

suspend fun main() {
    val bio = getBio()
    val picture = getPicture()

    val profile = Profile(bio.await(), picture.await())
    println(profile)
}

suspend fun getBio()  = GlobalScope.async {
    delay(500)
    "Test"
}

suspend fun getPicture() = GlobalScope.async {
    delay(100)
    "foto"
}