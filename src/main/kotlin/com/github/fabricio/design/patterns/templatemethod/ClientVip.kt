package com.github.fabricio.design.patterns.templatemethod

import java.math.BigDecimal

class ClientVip {

    fun executar() {
        var transferencia = Transferencia("100", "211", BigDecimal.valueOf(1900))
        transferencia.executar(fun() { println() }, fun () { println(transferencia.valor) })
    }
}