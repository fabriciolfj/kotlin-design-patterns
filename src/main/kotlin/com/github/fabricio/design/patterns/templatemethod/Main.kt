package com.github.fabricio.design.patterns.templatemethod

//quando queremos que parte do algoritmo tenha uma funcionamento padrao e outras partes pode sem personalizadas
class Main

fun main() {
    var vip = ClientVip()
    vip.executar()

    var basic = ClientBasic()
    basic.executar()
}