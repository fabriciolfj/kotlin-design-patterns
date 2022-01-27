package com.github.fabricio.design.decorator

class LoggingGetCaptainStarTrekRepository(private val repository: StarTrekRepository) : StarTrekRepository by repository {

    override fun getCaptain(starship: String): String {
        println("Getting captain for $starship")
        return repository.getCaptain(starship)
    }
}