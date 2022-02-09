package com.github.fabricio.design.command

data class Soldado(val nome: String) {

    val ordens = mutableListOf<Command>()

    fun mover(x : Int, y: Int) {
        println("Movendo: $x, $y")
    }

    fun appendMover(x: Int, y: Int) = apply {
        ordens.add(moveGerator(this, x, y))
    }

    fun imprimirOrders() {
        ordens.forEach { it.invoke() }
    }
}