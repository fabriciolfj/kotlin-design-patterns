package com.github.fabricio.design.patterns.templatemethod

class Transferencia {

    fun executar(reservaValor: () -> Unit,
                 debitarValor: () -> Unit,
                 cobrarTaxa: (() -> Unit?) = fun() { println() }) {

        fun registrarContaOrigem(conta: String) {
            println("Conta origem: $conta")
        }

        fun registrarContaDestino(conta: String) {
            println("Conta destino: $conta")
        }

        reservaValor()
        debitarValor()
        cobrarTaxa?.let { it() }
    }
}