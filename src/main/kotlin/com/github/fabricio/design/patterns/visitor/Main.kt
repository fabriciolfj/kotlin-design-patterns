package com.github.fabricio.design.patterns.visitor

class Main

fun main() {
    val pedido = Pedido(Produto("1"), Produto("2"), Servico(Produto("1.1"), Produto("2.1")))

    val v = Visitor()
    v.run {
        pedido.accept(this)
    }

    v.getItensVisitados().forEach { println(it) }
}