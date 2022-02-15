package com.github.fabricio.design.patterns.decorator

class ValidatingAddCaptainStarTrekRepository(private val repository: StarTrekRepository) : StarTrekRepository by repository {

    override fun addCaptain(starship: String, captainName: String) {
         require (captainName.length < 15) { "$captainName is longer than 20 characters!" }
        repository.addCaptain(starship, captainName)
    }
}

