package com.daniilpuris.lesson20.homework.classes

import com.daniilpuris.lesson20.homework.Interfaces.*
import java.io.InputStream

abstract class SmartSpeaker : Powerable, Rechargeable, SoundEmitting, Programmable {

    abstract override fun powerOn()
    abstract override fun powerOff()

    abstract override fun getChargeLevel(): Double
    abstract override fun recharge()

    abstract override fun setVolume(volume: Int)
    abstract override fun mute()
    abstract override fun playSound(stream: InputStream)

    abstract override fun programAction(action: String)
    abstract override fun execute()
}
