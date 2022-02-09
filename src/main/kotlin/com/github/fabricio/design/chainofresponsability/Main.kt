package com.github.fabricio.design.chainofresponsability

//filtros, cada um com sua responsabilidade, caso um não seja atendido, delega para outro ou retorna o resultado
class Main

fun main() {
    var validar = ValidarPar(ValidarImpar(null))
    println(validar.execute(3))
}