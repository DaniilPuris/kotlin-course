package com.daniilpuris.lesson20.homework.classes

import com.daniilpuris.lesson20.homework.Interfaces.*

abstract class WashingMachine (
    override val maxTemperature: Int,
    override val capacity: Int
    ) : Powerable, WaterContainer, TemperatureRegulatable, Drainable, AutomaticShutdown, Timable
    {
        abstract override fun powerOn()
        abstract override fun powerOff()

        abstract override fun fillWater(amount: Int)
        abstract override fun getWater(amount: Int)

        abstract override fun setTemperature(temp: Int)

        abstract override fun connectToDrain()
        abstract override fun drain()

        abstract override fun startMonitoring()
        abstract override fun setTimer(time: Int)
    }
