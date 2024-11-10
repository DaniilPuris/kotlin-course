package com.daniilpuris.lesson20.homework.classes

import com.daniilpuris.lesson20.homework.Interfaces.*

abstract class Refrigerator(
    override val maxTemperature: Int,
    override val capacity: Int,
    override val sensorType: String,
    override val maxSensoredValue: Int
) : Powerable, TemperatureRegulatable, WaterContainer, AutomaticShutdown {

    abstract override fun powerOn()
    abstract override fun powerOff()

    abstract override fun setTemperature(temp: Int)

    abstract override fun fillWater(amount: Int)
    abstract override fun getWater(amount: Int)

    abstract override fun startMonitoring()
}