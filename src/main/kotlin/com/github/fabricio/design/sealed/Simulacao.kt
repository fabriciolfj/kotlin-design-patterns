package com.github.fabricio.design.sealed

class Simulacao

fun main() {
    var status : PizzaOrderStatus = OrderReceived(123)
    while(status !is Completed) {
        status = when(status) {
            is OrderReceived -> status.nextStatus()
            is OutForDelivery -> status.nextStatus()
            is Completed -> status
        }
    }

    print(status)
}