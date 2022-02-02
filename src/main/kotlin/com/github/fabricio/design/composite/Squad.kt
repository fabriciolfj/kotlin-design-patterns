package com.github.fabricio.design.composite

import com.github.fabricio.design.bridge.Trooper

data class Squad(private val troopers: List<Trooper>) : Trooper {

    constructor(vararg unit: Trooper) : this(unit.toList())

    override fun move() {
        troopers.forEach { it.move() }
    }

    override fun attackRebel() {
        troopers.forEach { it.attackRebel() }
    }
}