package com.daniilpuris.lesson20.homework.Interfaces

interface AutomaticShutdown {
    val sensorType: String
    val maxSensoredValue: Int
    fun startMonitoring()
}