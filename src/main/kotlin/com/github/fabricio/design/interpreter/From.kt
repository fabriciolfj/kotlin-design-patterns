package com.github.fabricio.design.interpreter

class From(private val table: String) {

    private lateinit var where: Where

    fun where(conditions: String) = apply {
        where = Where(conditions)
    }

    override fun toString(): String {
        return "from $table $where"
    }
}