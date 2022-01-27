package com.github.fabricio.design.abstractfactory

class UseCase


fun main() {
    val dados = Parse.server(listOf("port:8080", "environment:hom"))

    println(dados)
}