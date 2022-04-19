package com.github.fabricio.design.sealed

class OrderReceived(orderId: Int) : PizzaOrderStatus(orderId) {

    override fun nextStatus() = OutForDelivery(orderId)
}