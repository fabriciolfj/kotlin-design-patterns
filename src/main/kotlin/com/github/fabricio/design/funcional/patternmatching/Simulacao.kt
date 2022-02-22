package com.github.fabricio.design.funcional.patternmatching

class Simulacao

fun main() {
    val animal = Cat()

    getSound(animal)
}

fun getSound(animal: Animal) = when(animal) {
    is Cat -> animal.getSound()
    is Dog -> animal.getSound()
    else -> throw RuntimeException("Animal não reconhecido")
}