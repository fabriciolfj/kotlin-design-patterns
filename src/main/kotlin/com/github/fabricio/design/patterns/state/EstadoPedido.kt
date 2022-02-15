package com.github.fabricio.design.patterns.state

sealed class EstadoPedido

object Vazio: EstadoPedido()
object Carregando: EstadoPedido()
object Carregado: EstadoPedido()