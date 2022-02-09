package com.github.fabricio.design.visitor

data class Servico(var list: MutableList<Item> = mutableListOf()) : Item {

    constructor(vararg itens : Item) : this(mutableListOf()) {
        for (item in itens) {
            list.add(item)
        }
    }
}

fun Servico.accept(visitor: Visitor) = visitor.visit(this)