package com.github.fabricio.design.patterns.observer

class Email {

    fun send(msg: String) {
        println("Enviando pedido por email: $msg")
    }
}