package com.github.fabricio.design.patterns.bridge

class StormTrooper(private val legs: Legs, private val weapon: Weapon) : Trooper {

    override fun move() {
        println("Movimentação ${legs.move()}")
    }

    override fun attackRebel() {
        println("Ataque ${weapon.attack()}")
    }
}