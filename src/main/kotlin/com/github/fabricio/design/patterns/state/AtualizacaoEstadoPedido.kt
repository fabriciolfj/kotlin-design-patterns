package com.github.fabricio.design.patterns.state

interface AtualizacaoEstadoPedido {

    fun atualizarCarregamento(quantidade: Int)

    fun mudarEstado()
}