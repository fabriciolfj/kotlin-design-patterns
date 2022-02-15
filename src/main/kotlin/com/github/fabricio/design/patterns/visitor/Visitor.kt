package com.github.fabricio.design.patterns.visitor

class Visitor {

    private var itensVisitados = mutableListOf<Item>()

    fun visit(servico: Servico) {
        visit(servico.list)
    }

    fun visit(pedido: Pedido) {
        visit(pedido.list)
    }

    fun getItensVisitados() : List<Item> {
        return this.itensVisitados
    }

    private fun visit(itens: List<Item>) {
        for (item in itens) {
            when(item) {
                is Produto -> itensVisitados.add(item)
                is Servico -> item.accept(this)
            }
        }
    }
}