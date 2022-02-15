package com.github.fabricio.design.patterns.state

data class Pedido(private var quantidade: Int, private var quantidadeCarregada: Int, private var estadoPedido: EstadoPedido = Vazio) : AtualizacaoEstadoPedido {

    override fun atualizarCarregamento(quantidade: Int) {
        this.quantidadeCarregada += quantidade
    }

    override fun mudarEstado() {
        if (quantidadeCarregada in 1 until quantidade) {
            this.estadoPedido = Carregando
            return
        }

        this.estadoPedido = Carregado
    }

    override fun toString(): String {
        return "quantidade: $quantidade, carregado: $quantidadeCarregada, estado: $estadoPedido"
    }
}