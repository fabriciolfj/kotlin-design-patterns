package com.github.fabricio.design.staticmethodfactory

class UseCase

fun main() {
    val server = Server.withPort(8080)

    println(server)
}