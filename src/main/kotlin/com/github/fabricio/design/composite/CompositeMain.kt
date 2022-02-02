package com.github.fabricio.design.composite

import com.github.fabricio.design.bridge.*

class CompositeMain {
}

fun main() {
    var squad  = Squad(StormTrooper(RegularLegs(), Rifle()), StormTrooper(AthleticLegs(), Flamethrower()))

    squad.move()
    squad.attackRebel()
}