package com.daniilpuris.Lesson10

fun main(){

// 1. Пустой неизменяемый список целых чисел.
    val intList: List<Int> = listOf()
    println(intList)

// 2. Неизменяемый список строк,
// содержащий три элемента ("Hello", "World", "Kotlin").
    val stringList: List<String> = listOf("Hello", "World", "Kotlin")
    println(stringList)

// 3. Изменяемый список целых чисел
// и инициализация его значениями от 1 до 5.
    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    println(mutableList)

// 4. Изменяемый список целых чисел,
// добавление в него новые элементы (6, 7, 8).
    val mutableList2: MutableList<Int> = mutableListOf()
    mutableList2.add(6)
    mutableList2.add(7)
    mutableList2.add(8)
    println(mutableList2)

// 5. Из изменяемого списка строк,
// удаление из него определенного элемента ("World").
    val mutableList3: MutableList<String> = mutableListOf("Hello", "World")
    mutableList3.remove("World")
    println(mutableList3)
}
