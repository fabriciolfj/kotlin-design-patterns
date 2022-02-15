package com.github.fabricio.design.patterns.state

class FacadePedido {

    fun executeAtualizacaoPedido(pedido: Pedido, quantidade: Int) : Pedido {
        pedido.atualizarCarregamento(quantidade)
        pedido.mudarEstado()

        return pedido
    }
}