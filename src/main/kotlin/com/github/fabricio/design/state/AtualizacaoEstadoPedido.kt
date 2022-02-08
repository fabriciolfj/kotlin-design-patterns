package com.github.fabricio.design.state

interface AtualizacaoEstadoPedido {

    fun atualizarCarregamento(quantidade: Int)

    fun mudarEstado()
}