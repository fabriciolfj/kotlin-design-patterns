package com.github.fabricio.design.strategy

// quando queremos mudar o comportamento do objeto em tempo de execução
class Main

fun main() {
    val soldado = Soldado()
    println(soldado.atirar.invoke())

    soldado.currentWeapon = Arma::bazuca
    println(soldado.atirar.invoke())
}