package com.github.fabricio.design.patterns.interpreter

import select

class Main

fun main() {
    var sql = select("one, two") {
        from("product") {
            where("one > 1")
        }
    }

    println(sql)
}