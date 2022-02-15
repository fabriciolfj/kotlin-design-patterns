package com.github.fabricio.design.patterns.templatemethod

import java.math.BigDecimal

data class Transferencia(val origem: String, val destino: String, val valor: BigDecimal) {

    fun executar(reservaValor: () -> Unit,
                 debitarValor: () -> Unit,
                 cobrarTaxa: (() -> Unit?) = fun() { println() }) {

        fun registrarContaOrigem(conta: String) {
            println("Conta origem: $conta")
        }

        fun registrarContaDestino(conta: String) {
            println("Conta destino: $conta")
        }

        registrarContaDestino(origem)
        registrarContaOrigem(destino)
        debitarValor()
        cobrarTaxa?.let { it() }
    }
}