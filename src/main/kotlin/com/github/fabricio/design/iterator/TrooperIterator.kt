package com.github.fabricio.design.iterator


/*
* Quando queremos achatar um processo, como percorrer uma lista, podemos utilizar esse pattern
* */
class TrooperIterator(private val units: List<Trooper>) : Iterator<Trooper>{

    private var i = 0
    private var iterator: Iterator<Trooper> = this

    override fun hasNext(): Boolean {
        if (i >= units.size) {
            return false
        }

        if (i == units.size - 1) {
            if (iterator != this) {
                return iterator.hasNext()
            }
        }

        return true
    }

    override fun next(): Trooper {
        if (iterator != this) {
            if (iterator.hasNext() ) {
                return iterator.next()
            } else {
                i++
                iterator = this
            }

        }

        return when (val e = units[i]) {
            is Squad -> {
                iterator = e.iterator()
                this.next()
            } else -> {
                i++
                e
            }
        }

    }


}