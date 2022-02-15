package com.github.fabricio.design.patterns.strategy

object Arma {

    fun rifle(x: Int, y: Int, direcao: Direcao) = Projetil(x, y, direcao)

    fun pistola(x: Int, y: Int, direcao: Direcao) = Projetil(x+5, y+1, direcao)

    fun bazuca(x: Int, y: Int, direcao: Direcao) = Projetil(x+1, y+2, direcao)


}