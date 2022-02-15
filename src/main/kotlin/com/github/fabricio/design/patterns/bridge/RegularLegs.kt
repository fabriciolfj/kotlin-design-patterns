package com.github.fabricio.design.patterns.bridge

class RegularLegs : Legs {
    override fun move() = Constantes.REGULAR_SPEED
}