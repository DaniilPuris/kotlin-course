package com.daniilpuris.lesson20.homework.Interfaces

interface TemperatureRegulatable {
    val maxTemperature: Int
    fun setTemperature(temp: Int)
}