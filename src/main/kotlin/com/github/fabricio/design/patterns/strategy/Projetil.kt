package com.github.fabricio.design.patterns.strategy

data class Projetil(val x: Int, val y: Int, val direcao: Direcao) {
    override fun toString(): String {
        return "X: $x, Y: $y, direção: $direcao"
    }
}