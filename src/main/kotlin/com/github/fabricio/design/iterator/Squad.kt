package com.github.fabricio.design.iterator


class Squad(private val units: List<Trooper>) : Trooper {

    constructor(vararg units: Trooper) : this(units.toList())

    operator fun iterator(): Iterator<Trooper> {
        return TrooperIterator(units)
    }
}