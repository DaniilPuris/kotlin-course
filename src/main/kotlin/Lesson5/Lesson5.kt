package com.daniilpuris.Lesson5

// 1. Рассчитать предполагаемую интенсивность звука после затухания.

fun main() {
    val initialSoundIntensity = 10.0
    val knownAttenuationСoefficient: Double = 0.2
    val intensityWithKnownCoefficent = calculateAttenuationСoefficient(initialSoundIntensity, knownAttenuationСoefficient)

    println("Интенсивность звука после затухания: $intensityWithUnknownCoefficient")
}



fun calculateAttenuationСoefficient(initialSoundIntensity: Double, attenuationСoefficient: Double?): Double {
    val effectiveAttenuationСoefficient = attenuationСoefficient ?: 0.5
    return initialSoundIntensity * effectiveAttenuationСoefficient
}