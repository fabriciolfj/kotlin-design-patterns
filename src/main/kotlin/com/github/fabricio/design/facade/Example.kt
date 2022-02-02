package com.github.fabricio.design.facade

import com.github.fabricio.design.staticmethodfactory.Server
import kotlin.io.path.Path

class Example

fun Server.startFromConfiguration(fileLocation: String) {
    val path = Path(fileLocation)
    val lines = path.toFile().readLines()

    val configuration = try {
        JsonParser().server(lines)
    } catch (e: RuntimeException) {
        YamlParser().server(lines)
    }

    Server.withPort(configuration.port)
}


interface Parser {
    fun property(prop: String): Property
    fun server(propertyStrings: List<String>): ServerConfiguration
}

class YamlParser : Parser {
    // Implementation specific to YAML files
    override fun property(prop: String): Property {
        TODO("Not yet implemented")
    }

    override fun server(propertyStrings: List<String>): ServerConfiguration {
        TODO("Not yet implemented")
    }
}

class JsonParser : Parser {

    // Implementation specific to JSON files
    override fun property(prop: String): Property {
        TODO("Not yet implemented")
    }

    override fun server(propertyStrings: List<String>): ServerConfiguration {
        TODO("Not yet implemented")
    }
}

class Property

class ServerConfiguration {
    var port: Long = 8080
}