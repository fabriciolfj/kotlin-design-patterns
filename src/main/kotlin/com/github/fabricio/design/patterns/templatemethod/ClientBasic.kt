package com.github.fabricio.design.patterns.templatemethod

import java.math.BigDecimal

class ClientBasic {

    fun executar() {
        var transferencia = Transferencia("223", "11", BigDecimal.valueOf(2000.00))
        transferencia.executar(fun() { println("56") }, fun () { println("21") }, fun() { println(cobrarTaxa(transferencia.valor)) })
    }

    private fun cobrarTaxa(value: BigDecimal) : BigDecimal {
        return value.multiply(BigDecimal.valueOf(1.9)).divide(BigDecimal.valueOf(100))
    }
}