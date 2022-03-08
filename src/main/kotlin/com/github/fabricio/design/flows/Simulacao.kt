package com.github.fabricio.design.flows

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//são frios, ou seja, emite eventos quando alguem assina e este recebe todos os eventos
//backpressure
//emit emitir
//collect assinar o evento
class Simulacao

fun main() {
    runBlocking {
        val numbersFlow : Flow<Int> = flow {
            (0..10).forEach {
                println("sending $it")
                emit(it)
            }
        }

        /*(1..4).forEach { id ->
            delay(500)
            launch(Dispatchers.Default) {
                numbersFlow.collect { number ->
                    delay(1000)
                    println("Coroutine $id received $number")
                }
            }
        }*/

        (1..4).forEach { id ->
            delay(500)
            launch(Dispatchers.Default) {
                numbersFlow.buffer().collect {
                    delay(1000)
                    println("Coroutine $id received $it")
                }
            }
        }

        //pegando os mais recentes
        val stock : Flow<Int> = flow {
            var i =0
            while(true) {
                emit(i++)
                delay(100)
            }
        }

        var seconds = 0
        stock.conflate().collect {
            delay(100)
            seconds++
            println("$seconds seconds -> receied $it")
        }
    }
}