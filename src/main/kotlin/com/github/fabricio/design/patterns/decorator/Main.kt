package com.github.fabricio.design.patterns.decorator

class Main

fun main() {
    var default = DefaultStarTrekRepository()
    var log = LoggingGetCaptainStarTrekRepository(default)

    log.addCaptain("Cometa", "Lucas")
    log.getCaptain("Lucas")

    var validation = ValidatingAddCaptainStarTrekRepository(default)
    validation.addCaptain("Sao bento", "Carlos")

    println(validation.getCaptain("Cometa"))
}