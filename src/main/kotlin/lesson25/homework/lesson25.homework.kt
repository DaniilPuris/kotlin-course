package com.daniilpuris.lesson25.homework

fun main() {

    // 1.
    printConst()
    const2()
    const3()
    const4(Unit)

    // 2.
    val numbers = listOf(1, 2, 3)
    val emptyList = emptyList<Int>()

    println(calculateAverage2(numbers))
    println(calculateAverage2(emptyList))
    println(calculateAverage3(numbers))
    println(calculateAverage3(emptyList))
    println(calculateAverage4(numbers))
    println(calculateAverage4(emptyList))

    // 3.
    val strings = listOf("aa", "aaa", "aaaa", "aaaaa", "aaaaaa")
    val minLength = 4
    val emptyStrings = emptyList<String>()

    try {
        val filteredStrings = filterStringsByLength(strings, minLength)
        println(filteredStrings)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    try {
        val result = filterStringsByLength(emptyStrings, minLength)
        println(result)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    try {
        val filteredStrings = filterStringsByLength2(strings, minLength)
        println(filteredStrings)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    try {
        val result = filterStringsByLength2(emptyStrings, minLength)
        println(result)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    try {
        val filteredStrings = filterStringsByLength3(strings, minLength)
        println(filteredStrings)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    try {
        val result = filterStringsByLength3(emptyStrings, minLength)
        println(result)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    try {
        val filteredStrings = filterStringsByLength(strings, minLength)
        println(filteredStrings)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    try {
        val result = filterStringsByLength(emptyStrings, minLength)
        println(result)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }


}


// 1. Константная переменная со String. Функция, которая ничего не принимает и не возвращает
//    и печатает в консоль текст константы.

const val const = "Текст"
fun printConst() {
    println(const)
}

// 1. Аналогичная анонимная функция

val const2 = fun() {
    println(const)
}

// 1. Аналогичное лямбда выражение с указанием типа.
val const3:() -> Unit = { ->
    println(const)
}

// 1. Аналогичное лямбда выражение без указания типа.

val const4 = { arg: Unit ->
    println(const)
}


// 2. Функцию, которая принимает список чисел и возвращает среднее арифметическое этого списка.
//    С помощью require проверяем, что список не пустой.

fun calculateAverage(numbers: List<Int>): Double {
    require(numbers.isNotEmpty())
    return numbers.average()
}

// 2. Аналогичная анонимная функция

val calculateAverage2 = fun (numbers: List<Int>): Double {
    require(numbers.isNotEmpty())
    return numbers.average()
}

// 2. Аналогичное лямбда выражение с указанием типа.

val calculateAverage3: (List<Int>) -> Double = { numbers ->
    require(numbers.isNotEmpty())
    numbers.average()
}

// 2. Аналогичное лямбда выражение без указания типа.

val calculateAverage4 = { numbers: List<Int> ->
    require(numbers.isNotEmpty())
    numbers.average()
}


// 3. Функция, которая принимает список строк и число, а возвращает список из строк,
//    длина которых больше или равна заданному числу. Если список пуст, нужно выкинуть исключение.

fun filterStringsByLength(strings: List<String>, minLength: Int): List<String> {
    require(strings.isNotEmpty())
    return strings.filter { it.length >= minLength }
}

// 3. Аналогичная анонимная функция

val filterStringsByLength2 = fun (strings: List<String>, minLength: Int): List<String> {
    require(strings.isNotEmpty())
    return strings.filter { it.length >= minLength }
}

// 3. Аналогичное лямбда выражение с указанием типа.

val filterStringsByLength3: (List<String>, Int) -> List<String> = { strings, minLength ->
    require(strings.isNotEmpty())
    strings.filter { it.length >= minLength }
}

// 3. Аналогичное лямбда выражение без указания типа.

val filterStringsByLength4 = { strings: List<String>, minLength: Int ->
    require(strings.isNotEmpty())
    strings.filter { it.length >= minLength }
}

