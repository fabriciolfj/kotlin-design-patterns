package com.github.fabricio.design.patterns.templatemethod

class ClientBasic {

    fun executar() {
        var transferencia = Transferencia()
        transferencia.executar(fun() { println("56") }, fun () { println("21") }, fun() { println(1.9) })
    }
}