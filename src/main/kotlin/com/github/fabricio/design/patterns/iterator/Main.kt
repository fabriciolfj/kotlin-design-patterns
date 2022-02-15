package com.github.fabricio.design.patterns.iterator

class Main

fun main() {
    val platoon = Squad(
            StormTrooper("teste1"),
            Squad(StormTrooper("teste2 - squad1"), StormTrooper("teste3 - squad1")))

    for (trooper in platoon)
        println(trooper)
}