package com.github.fabricio.design.funcional

// quando temos uma funcao com varios parametros, quebramos em sub funcoes e cada uma recebendo um parametro
class MainCurrying {
}

fun main() {
    val result = subtract(9)(2)
    println(result)
}

fun subtract(x: Int) : (Int) -> Int {
    return fun (y: Int)  : Int {
        return x - y
    }
}