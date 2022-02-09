package com.github.fabricio.design.command

class Util

typealias Command = () -> Unit

val moveGerator = fun(soldado: Soldado, x: Int, y: Int) : Command {
    return fun() { soldado.mover(x, y) }
}