package com.github.fabricio.design.concorrencia.barrier

import kotlin.random.Random

data class FavoriteCharacter(val name: String, val catchphrase: String, val picture: ByteArray = Random.nextBytes(42))