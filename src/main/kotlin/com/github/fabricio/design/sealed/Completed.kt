package com.github.fabricio.design.sealed

class Completed(orderId: Int) : PizzaOrderStatus(orderId) {

    override fun nextStatus() = this
}