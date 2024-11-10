package com.daniilpuris.lesson20.homework.classes

import com.daniilpuris.lesson20.homework.Interfaces.*
import java.io.InputStream

abstract class ElectronicClock : Powerable, Timable, SoundEmitting {

        abstract override fun powerOn()
        abstract override fun powerOff()

        abstract override fun setTimer(time: Int)

        abstract override fun setVolume(volume: Int)
        abstract override fun mute()
        abstract override fun playSound(stream: InputStream)
    }
