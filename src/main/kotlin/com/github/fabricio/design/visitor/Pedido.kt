package com.github.fabricio.design.visitor

data class Pedido(var list : MutableList<Item> = mutableListOf()) {
    constructor(vararg itens: Item) : this(mutableListOf()) {
        for (s in itens) {
            this.list.add(s)
        }
    }
}

fun Pedido.accept(visitor: Visitor) = visitor.visit(this)
