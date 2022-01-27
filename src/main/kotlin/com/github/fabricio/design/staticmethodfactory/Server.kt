package com.github.fabricio.design.staticmethodfactory

class Server private constructor(port: Long){

    companion object {
        fun withPort(port: Long) = Server(port)
    }
}