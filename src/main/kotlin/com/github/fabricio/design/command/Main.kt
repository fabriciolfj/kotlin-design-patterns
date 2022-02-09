package com.github.fabricio.design.command

// encapsular ações dentro de um objeto
class Main {
}

fun main() {
    val soldado = Soldado("teste")
    soldado.appendMover(10, 20)
            .appendMover(30, 20)
            .appendMover(2, 5)

    soldado.imprimirOrders()
}