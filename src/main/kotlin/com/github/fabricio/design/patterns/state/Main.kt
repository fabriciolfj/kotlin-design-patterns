package com.github.fabricio.design.patterns.state

class Main

fun main() {
    val pedido = Pedido(100, 0)

    val facade = FacadePedido()
    facade.executeAtualizacaoPedido(pedido, 50)

    println(pedido)

    facade.executeAtualizacaoPedido(pedido, 50)

    println(pedido)
}