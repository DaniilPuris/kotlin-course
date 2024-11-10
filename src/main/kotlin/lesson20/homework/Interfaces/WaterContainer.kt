package com.daniilpuris.lesson20.homework.Interfaces

interface WaterContainer {
    val capacity: Int
    fun fillWater(amount: Int)
    fun getWater(amount: Int)
}