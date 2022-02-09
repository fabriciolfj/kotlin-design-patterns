package com.github.fabricio.design.chainofresponsability

data class ValidarImpar(private val semFiltro: Filtro?) : Filtro(semFiltro) {

    override fun execute(value: Int): String {

        if (value % 2 > 0)
            return "impar"

        throw RuntimeException("Valor invalido")
    }
}