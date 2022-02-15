package com.github.fabricio.design.patterns.composite

import com.github.fabricio.design.patterns.bridge.*


class CompositeMain {
}

fun main() {
    var squad  = Squad(StormTrooper(RegularLegs(), Rifle()), StormTrooper(AthleticLegs(), Flamethrower()))

    squad.move()
    squad.attackRebel()
}