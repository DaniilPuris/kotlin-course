package com.daniilpuris.lesson20.homework.classes

import com.daniilpuris.lesson20.homework.Interfaces.*

abstract class RobotVacuumCleaner : Powerable, Rechargeable, Movable, Cleanable, Programmable {

        abstract override fun powerOn()
        abstract override fun powerOff()

        abstract override fun getChargeLevel(): Double
        abstract override fun recharge()

        abstract override fun move(direction: String, distance: Int)

        abstract override fun clean()

        abstract override fun programAction(action: String)
        abstract override fun execute()
    }
