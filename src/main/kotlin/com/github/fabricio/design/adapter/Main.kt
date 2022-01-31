package com.github.fabricio.design.adapter

class Main {
}

fun main() {
    cellPhone(charger(usPowerOutlet().toEUPlug()).toUsbTypeC())
}

fun cellPhone(chargeCable: UsbTypeC) {
    if (chargeCable.hasPower) {
        println("Carregado")
        return
    }

    println("Sem bateria")
}

fun charger(plug: EUPlug) : UsbMini {
    return object : UsbMini {
        override val hasPower = Power.valueOf(plug.hasPower)
    }
}

fun usPowerOutlet(): USBPlug {
    return object: USBPlug {
        override val hasPowner = 1
    }
}

/*=====ADAPTER====*/
fun USBPlug.toEUPlug() : EUPlug {
    val hasPower = if (this.hasPowner == 1) "TRUE" else "FALSE"
    return object : EUPlug {
        override val hasPower = hasPower
    }
}

/*=====ADAPTER====*/
fun UsbMini.toUsbTypeC() : UsbTypeC {
    val hasPower = this.hasPower == Power.TRUE
    return object : UsbTypeC {
        override val hasPower = hasPower
    }
}