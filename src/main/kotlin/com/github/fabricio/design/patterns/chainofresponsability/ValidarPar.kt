package com.github.fabricio.design.patterns.chainofresponsability

data class ValidarPar(private var impar: Filtro?) : Filtro(impar) {

    override fun execute(value: Int): String {

        if (value % 2 == 0)
            return "par"

        return impar!!.execute(value)
    }
}