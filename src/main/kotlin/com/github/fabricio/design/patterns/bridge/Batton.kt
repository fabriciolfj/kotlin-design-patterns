package com.github.fabricio.design.patterns.bridge

class Batton : Weapon {
    override fun attack() = Constantes.RIFLE_DAMAGE * 3
}