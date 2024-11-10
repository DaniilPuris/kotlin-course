package com.daniilpuris.lesson20.homework.Interfaces

import java.io.InputStream

interface SoundEmitting {
    fun setVolume(volume: Int)
    fun mute()
    fun playSound(stream: InputStream)
}