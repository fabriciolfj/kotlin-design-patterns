package com.github.fabricio.design.bridge

// o padrão bridge serve para achatar as heranças, nesse caso poderia haver varias classes, cada
// uma contemplate um tipo de stormtroopers, mas a caracteristica de cada uma é passada via parâmetro (representada pela interface weapon e legs)
// caso surge uma nova funcionalidade, cria-se uma nova interface e implementações correspondentes
class BridgeMain {
}


fun main() {
    val trooper = StormTrooper(RegularLegs(), Flamethrower())
    val trooper2 = StormTrooper(AthleticLegs(), Rifle())

    trooper.attackRebel()
    trooper.move()

    println("===================")

    trooper2.attackRebel()
    trooper2.move()
}