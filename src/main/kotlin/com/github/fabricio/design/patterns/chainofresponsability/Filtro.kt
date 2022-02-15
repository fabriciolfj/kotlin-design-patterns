package com.github.fabricio.design.patterns.chainofresponsability

abstract class Filtro(val filtro: Filtro?) {

    abstract fun execute(value: Int) : String
}