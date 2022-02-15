package com.github.fabricio.design.patterns.interpreter

class Select(private val column: String) {

    private lateinit var from: From

    fun from(table: String) = apply {
        from = From(table)
    }

    override fun toString(): String {
        return "select $column $from"
    }
}