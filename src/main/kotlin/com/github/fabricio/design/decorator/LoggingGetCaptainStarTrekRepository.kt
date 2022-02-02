package com.github.fabricio.design.decorator

//by delega a implementação para outro objeto, no caso se omitirmos o getCaptaian, ele pegaria de outra classe que implementa tal interface
class LoggingGetCaptainStarTrekRepository(private val repository: StarTrekRepository) : StarTrekRepository by repository {

    override fun getCaptain(starship: String): String {
        println("Getting captain for $starship")
        return repository.getCaptain(starship)
    }
}