package com.github.fabricio.design.factorymethod

import java.lang.RuntimeException

class UseCase {
}

fun main() {
    var list = arrayListOf<ChessPiece>()
    list.add(createPeice("p1A"))
    list.add(createPeice("q5T"))

    list.forEach { println(it) }
}


fun createPeice(notation: String) : ChessPiece {

    val (type, file, rank) = notation.toCharArray()

    return when(type) {
        'p' -> Pawn(file, rank)
        'q' -> Queen(file, rank)
        else -> throw RuntimeException("Unknown piece: $type")
    }
}