package com.github.fabricio.design.state

sealed class EstadoPedido

object Vazio: EstadoPedido()
object Carregando: EstadoPedido()
object Carregado: EstadoPedido()