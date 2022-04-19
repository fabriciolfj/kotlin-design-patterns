package com.github.fabricio.design.funcional

// quando temos uma funcao com varios parametros, quebramos em sub funcoes e cada uma recebendo um parametro
class MainCurrying {
}

fun main() {
    val result = subtract2(9)(2)(3)
    println(result)
}

fun subtract(x: Int) : (Int) -> Int {
    return fun (y: Int)  : Int {
        return x - y
    }
}

fun subtract2(x: Int) : (Int) -> (Int) -> Int {
    return fun (y: Int)  : (Int) -> Int {
        return fun(z: Int) : Int {
            return x - y - z
        }
    }
}