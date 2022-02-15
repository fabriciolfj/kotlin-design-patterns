package com.github.fabricio.design.patterns.bridge

class Flamethrower : Weapon {

    override fun attack() = Constantes.RIFLE_DAMAGE * 2

}