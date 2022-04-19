package com.github.fabricio.design.sealed

class OutForDelivery(orderId: Int) : PizzaOrderStatus(orderId) {

    override fun nextStatus() = Completed(orderId)
}