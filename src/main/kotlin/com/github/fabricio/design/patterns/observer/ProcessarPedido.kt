package com.github.fabricio.design.patterns.observer

data class ProcessarPedido(val descricao: String) {

    private val eventos =  mutableMapOf<() -> Unit, () -> Unit>()

    fun adicionar(funcao: () -> Unit) {
        eventos[funcao] = funcao
    }

    fun atualizarPedido() {
        println("Atualizando pedido")
        eventos.forEach { it.value.invoke() }
    }
}