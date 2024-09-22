package com.daniilpuris.Lesson5

fun main() {
    println("Интенсивность звука c известным коэффицентом затухания: $intensityWithKnownCoefficent")
    println("Интенсивность звука c неизвестным коэффицентом затухания: $intensityWithUnknownAttenuationСoefficient")
    println(cargoDelivery)
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


// 2. Рассчитать полную стоимость доставки.
// Клиент оплачивает доставку груза. К стоимости доставки добавляется страховка на груз,
// которая составляет 0,5% от его стоимости. В случае, если стоимость не указана, то берётся стандартная стоимость в $50

val cargoCost: Double = 10.0
val cargoDelivery = calculateCargoDelivery(cargoCost)

fun calculateCargoDelivery(cargoCost: Double? = null): Double {
    val cost = cargoCost ?: 50.0
    val cargoInsurance = cost * 0.05
    return cost + cargoInsurance
}

