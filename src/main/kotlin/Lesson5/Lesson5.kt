package com.daniilpuris.Lesson5

fun main() {
    println("Интенсивность звука c известным коэффицентом затухания: $intensityWithKnownCoefficent")
    println("Интенсивность звука c неизвестным коэффицентом затухания: $intensityWithUnknownAttenuationСoefficient")
}

// 1. Рассчитать предполагаемую интенсивность звука после затухания.

val initialSoundIntensity = 10.0
val knownAttenuationСoefficient: Double = 0.2
val unknownAttenuationСoefficient: Double? = null
val intensityWithKnownCoefficent = calculateAttenuationСoefficient(initialSoundIntensity, knownAttenuationСoefficient)
val intensityWithUnknownAttenuationСoefficient = calculateAttenuationСoefficient(initialSoundIntensity, unknownAttenuationСoefficient)

fun calculateAttenuationСoefficient(initialSoundIntensity: Double, attenuationСoefficient: Double?): Double {
    val effectiveAttenuationСoefficient = attenuationСoefficient ?: 0.5
    return initialSoundIntensity * effectiveAttenuationСoefficient
}