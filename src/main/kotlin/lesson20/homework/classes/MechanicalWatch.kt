package com.daniilpuris.lesson20.homework.classes

import com.daniilpuris.lesson20.homework.Interfaces.*

abstract class MechanicalWatch : Mechanical, Timable {

    abstract override fun performMechanicalAction()

    abstract override fun setTimer(time: Int)
}