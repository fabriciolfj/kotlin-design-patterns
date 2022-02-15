package com.github.fabricio.design.patterns.staticmethodfactory

class Server private constructor(port: Long){

    companion object {
        fun withPort(port: Long) = Server(port)
    }
}