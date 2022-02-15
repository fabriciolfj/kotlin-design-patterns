package com.github.fabricio.design.patterns.interpreter

class Where(private val clausura: String) {

    override fun toString(): String {
        return "where $clausura"
    }
}