package com.github.fabricio.design.patterns.abstractfactory

class UseCase


fun main() {
    val dados = com.github.fabricio.design.patterns.abstractfactory.Parse.server(listOf("port:8080", "environment:hom"))

    println(dados)
}