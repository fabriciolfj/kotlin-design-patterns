package com.github.fabricio.design.concorrencia.barrier

import kotlinx.coroutines.*
import kotlin.random.Random

//capacidade de esperar que varias threads simultâneas sejam concluidas antes de prosseguir
//exemplo: compor objetos de diferentes fontes
class Simulacao

fun main() {
    runBlocking {
        val (name, catch, _) = fetchFavoriteCharacter("fabricio")
        println(" $name - $catch ")
    }
}

suspend fun fetchFavoriteCharacter(name: String) = coroutineScope {
    val catchphrase = getCatchphraseAsync(name)
    val picture = getPicture(name)

    FavoriteCharacter(name, catchphrase.await(), picture.await())
}

fun CoroutineScope.getCatchphraseAsync(
        characterName: String
) = async {
    // Simulate network call
    delay(100)
    when (characterName) {
        "Inigo Montoya" -> "Hello. My name is Inigo Montoya. You killed my father. Prepare to die."
        else -> "No catchprase found"
    }
}

fun CoroutineScope.getPicture(
        characterName: String
) = async {
    // Simulate network call
    delay(500)
    when (characterName) {
        else -> Random.nextBytes(42)
    }
}
