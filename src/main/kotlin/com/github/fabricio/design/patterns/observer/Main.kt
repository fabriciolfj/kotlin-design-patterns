package com.github.fabricio.design.patterns.observer

class Main

fun main() {
    val email = Email()
    val sms = Sms()

    val processarPedido = ProcessarPedido("test")
    processarPedido.adicionar { email.send(processarPedido.descricao) }
    processarPedido.adicionar { sms.send(processarPedido.descricao) }

    processarPedido.atualizarPedido()
}