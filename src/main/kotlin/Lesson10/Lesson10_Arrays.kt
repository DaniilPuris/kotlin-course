package com.daniilpuris.Lesson10

fun main() {

    // Массивы
// 1. Массив из 5 целых чисел с значениями от 1 до 5.
    val firstArray = arrayOf(1, 2, 3, 4, 5)
    println(firstArray.toList())

// 2. Пустой массив строк размером 10 элементов.
    val emptyArray = Array(10) { "" }
    println(emptyArray.toList())

// 3. Массив из 5 элементов типа Double
// с значениями, являющимися удвоенным индексом элемента.
    val doubleArray = DoubleArray(5) {index -> index * 2.0}
    println(doubleArray.toList())

// 4. Массив из 5 элементов типа Int.
// Цикл, который присваивает каждому элементу значение,
// равное его индексу, умноженному на 3.
    val intArray = IntArray(5)
    for (index in intArray.indices) {
        intArray[index] = index * 3
    }
    println(intArray.toList())

// 5. Массив из 3 nullable строк.
// Инициализация одним null значением и двумя строками.
    val stringArray: Array<String?> = arrayOf(null, "+", "-")
    println(stringArray.toList())

// 6. Копирование массива целых чисел в новый массив в цикле.

}



