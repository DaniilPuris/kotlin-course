package com.daniilpuris.lesson19.homework

class SlotMachine(
    val color: String,
    val model: String,
    private var turnOn: Boolean,
    private var osLoad: Boolean,
    val availableGamesList: List<String>,
    val joystickAvailability: Boolean,
    private var proceedsBalance: Double,
    private val owner: String,
    var supportPhoneNumber: String
) {
    fun turnOn() {
        turnOn = true
        osLoad()
    }
    fun turnOff() {
        osShutDown()
        turnOn = false
    }
    private fun osLoad() {}
    private fun osShutDown() {}
    fun showAvailableGamesList() {}
    fun turnOnGame() {}
    fun payForGameSession() {}
    fun openSafeGetCash() {}
    open protected fun payWinnings() {}
}