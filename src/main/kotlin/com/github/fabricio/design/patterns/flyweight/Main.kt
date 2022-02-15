package com.github.fabricio.design.patterns.flyweight

//padrão para fazer reuso de objetos e não sobrecarregar a memória
class Main {
}

fun main() {
    val car = Car()
    car.images.forEach { println(it) }
}