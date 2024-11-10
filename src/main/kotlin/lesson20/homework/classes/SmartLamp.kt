package com.daniilpuris.lesson20.homework.classes

import com.daniilpuris.lesson20.homework.Interfaces.*

abstract class SmartLamp : Powerable, LightEmitting, Programmable {
        abstract override fun powerOn()
        abstract override fun powerOff()

        abstract override fun emitLight()
        abstract override fun completeLiteEmission()

        abstract override fun programAction(action: String)
        abstract override fun execute()
    }
