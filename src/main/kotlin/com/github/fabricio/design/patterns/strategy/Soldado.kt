package com.github.fabricio.design.patterns.strategy

class Soldado {

    private var direction = Direcao.LEFT
    private var x: Int = 42
    private var y: Int = 173


    var currentWeapon = Arma::rifle

    val atirar = fun() : Projetil {
        return currentWeapon(x, y, direction)
    }


}