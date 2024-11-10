package com.daniilpuris.lesson20.homework.classes

import com.daniilpuris.lesson20.homework.Interfaces.*

abstract class CoffeeMachine (
    override val capacity: Int
) : Powerable, WaterContainer, TemperatureRegulatable, Programmable {

    abstract override fun powerOn()
    abstract override fun powerOff()

    abstract override fun fillWater(amount: Int)
    abstract override fun getWater(amount: Int)

    abstract override fun setTemperature(temp: Int)

    abstract override fun programAction(action: String)
    abstract override fun execute()
}
