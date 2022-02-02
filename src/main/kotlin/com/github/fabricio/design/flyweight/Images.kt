package com.github.fabricio.design.flyweight

object Images {

    val images = List(8) {
        i -> when (i) {
            0 -> "image-1"
            1 -> "image-2"
            in 2..4 -> "image-${i+1}"
        else ->  "image-last"
    }
    }
}