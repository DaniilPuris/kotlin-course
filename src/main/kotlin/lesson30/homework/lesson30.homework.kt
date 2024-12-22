package com.daniilpuris.lesson30.homework

fun main() {
    println(PropertyType.APARTMENT.humanReadableNames())
    println(Planets.MERCURY.getInfo())
    printSortedPropertyTypes()
    val status1 = getTestStatus {
        println("Тест выполняется успешно")
    }
    println(status1)
}


// Enum со статусами прохождения теста (pass, broken, failure)

enum class TestsStatuses {
PASS,
BROKEN,
FAILURE
}


// Enum с типами жилой недвижимости для сайта аренды, 
//включая человекопонятные названия этих типов.

enum class PropertyType {
    APARTMENT,
    HOUSE,
    STUDIO,
    VILLA;

    fun humanReadableNames (): String {
        return when (this) {
            APARTMENT -> "Квартира"
            HOUSE -> "Дом"
            STUDIO -> "Студия"
            VILLA -> "Вилла"
        }
    }
}


// Enum с планетами солнечной системы, 
// включая расстояние до солнца в астрономических единицах и вес планеты.

enum class Planets (
    val distanceToSun: Double,
    val mass: Double
) {
    MERCURY(0.387, 0.330),
    VENUS(0.723, 4.87),
    EARTH(1.0, 5.97),
    MARS(1.524, 0.642),
    JUPITER(5.203, 1898.0),
    SATURN(9.537, 568.0),
    URANUS(19.191, 86.8),
    NEPTUNE(30.069, 102.0);

    fun getInfo(): String {
        return "Планета $name:\n" +
               "Расстояние до Солнца: $distanceToSun а.е.\n" +
               "Вес: $mass × 10^24 кг"
}
}

// Функция, которая выводит на печать человекочитаемые названия типов недвижимости 
// в порядке возрастания длины названия enum.

fun printSortedPropertyTypes() {
    PropertyType.values()
        .sortedBy { it.humanReadableNames().length }
        .forEach { propertyType ->
            println(propertyType.humanReadableNames())
        }
}       


// Функция, которая принимает лямбду без аргументов и возвращаемого значения 
// и возвращает Enum со статусом прохождения теста 
// в зависимости от того как выполнится принятая лямбда. 
// Если без исключений — pass, если будет AssertionError — failure,
// прочие исключения — broken.

fun getTestStatus(test: () -> Unit): TestsStatuses = try {
    test()
    TestsStatuses.PASS
} catch (e: AssertionError) {
    TestsStatuses.FAILURE
} catch (e: Exception) {
    TestsStatuses.BROKEN
}