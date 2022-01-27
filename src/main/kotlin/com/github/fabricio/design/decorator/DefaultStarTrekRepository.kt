package com.github.fabricio.design.decorator

open class DefaultStarTrekRepository : StarTrekRepository {

    private val starshipCaptains = mutableMapOf("Uss enterprise" to "fabricio", "Sao bento"  to "suzana")

    override fun getCaptain(starship: String) : String {
        return starshipCaptains[starship] ?: "Unknown"
    }

    override fun addCaptain(starship: String, captainName: String) {
        starshipCaptains[starship] = captainName
    }

    override fun get(starshipName: String): String {
        return starshipCaptains[starshipName] ?: ""
    }

    override fun set(starshipName: String, captainName: String) {
        starshipCaptains[starshipName] = captainName
    }

    fun set(test: String, test2: String, test3: String) : String{
        return ""
    }
}