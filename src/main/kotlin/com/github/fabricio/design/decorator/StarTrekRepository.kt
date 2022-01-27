package com.github.fabricio.design.decorator

interface StarTrekRepository {

    fun getCaptain(starshipName: String) : String
    fun addCaptain(starshipName: String, captainName: String)

    operator fun get(starshipName: String) : String
    operator fun set(starshipName: String, captainName: String)
}