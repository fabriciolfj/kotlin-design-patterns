package com.github.fabricio.design.patterns.bridge

class AthleticLegs : Legs {
    override fun move() = Constantes.REGULAR_SPEED * 2
}