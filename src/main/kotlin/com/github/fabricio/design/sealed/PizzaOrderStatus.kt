package com.github.fabricio.design.sealed


sealed class PizzaOrderStatus(protected val orderId: Int) {

    abstract fun nextStatus() :  PizzaOrderStatus
}