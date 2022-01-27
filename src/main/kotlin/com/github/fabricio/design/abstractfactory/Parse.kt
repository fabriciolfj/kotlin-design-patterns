package com.github.fabricio.design.abstractfactory

import java.lang.RuntimeException

class Parse {
    companion object {

        fun property(prop: String) : Property {

            val (name, value) = prop.split(":")

            return when (name) {
                "port" -> IntPropertyImpl(name, value.trim())
                "environment" -> StringPropertyImpl(name, value)
                else -> throw RuntimeException("Unknown property: $name")
            }
        }

        fun server(list: List<String>) : ServerConfigurationImpl {
            val props = list.map { property(it) }
                    .toList()

            return ServerConfigurationImpl(props)
        }
    }
}

