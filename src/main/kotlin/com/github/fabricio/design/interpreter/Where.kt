package com.github.fabricio.design.interpreter

class Where(private val clausura: String) {

    override fun toString(): String {
        return "where $clausura"
    }
}