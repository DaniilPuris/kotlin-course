package com.daniilpuris.lesson20.homework.classes

import com.daniilpuris.lesson20.homework.Interfaces.*

abstract class Flashlight : Powerable, BatteryOperated, LightEmitting {

    abstract override fun powerOn()
    abstract override fun powerOff()

    abstract override fun getCapacity(): Double
    abstract override fun replaceBattery()

    abstract override fun emitLight()
    abstract override fun completeLiteEmission()
}
