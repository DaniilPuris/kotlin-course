package com.daniilpuris.Lesson10

fun main(){

// 1. Пустое неизменяемое множество целых чисел.
    val emptySet: Set<Int> = setOf()
    println(emptySet)

// 2. Неизменяемое множество целых чисел,
// содержащее три различных элемента (1, 2, 3).
    val intSet: Set<Int> = setOf(1, 2, 3)
    println(intSet)

// 3. Изменяемое множество строк
// и инициализация его несколькими значениями ("Kotlin", "Java", "Scala").
    val mutableSet: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")
    println(mutableSet)

// 4. Добавление новых элементов в изменяемое множество строк ("Swift", "Go").
    val mutableSet2: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")
    mutableSet2.add("Swift")
    mutableSet2.add("Go")
    println(mutableSet2)

// 5. Удаление определенного элемента из изменяемого множества целых чисел (2).
    val mutableSet3: MutableSet<Int> = mutableSetOf(1, 2, 3)
    mutableSet3.remove(2)
    println(mutableSet3)
}