package com.github.fabricio.design.builder

class UseCase

fun main() {
    val email = MailBuilder().email("fabricio@outlook.com").body("teste").title("teste")

    println(email)
}