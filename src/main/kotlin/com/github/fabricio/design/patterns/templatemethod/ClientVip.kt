package com.github.fabricio.design.patterns.templatemethod

class ClientVip {

    fun executar() {
        var transferencia = Transferencia()
        transferencia.executar(fun() { println("1221") }, fun () { println("9921") })
    }
}