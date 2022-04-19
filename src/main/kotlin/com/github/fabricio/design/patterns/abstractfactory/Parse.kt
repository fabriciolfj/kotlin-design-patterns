package com.github.fabricio.design.patterns.abstractfactory

import java.lang.RuntimeException

class Parse {
    companion object {

        fun property(prop: String) : com.github.fabricio.design.patterns.abstractfactory.Property {

            val (name, value) = prop.split(":")

            return when (name) {
                "port" -> com.github.fabricio.design.patterns.abstractfactory.IntPropertyImpl(name, value.trim())
                "environment" -> com.github.fabricio.design.patterns.abstractfactory.StringPropertyImpl(name, value)
                else -> throw RuntimeException("Unknown property: $name")
            }
        }

        fun server(list: List<String>) : com.github.fabricio.design.patterns.abstractfactory.ServerConfigurationImpl {
            val props = list.map { com.github.fabricio.design.patterns.abstractfactory.Parse.property(it) }
                    .toList()

            return com.github.fabricio.design.patterns.abstractfactory.ServerConfigurationImpl(props)
        }
    }
}

