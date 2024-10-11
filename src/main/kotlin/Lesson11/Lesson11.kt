package com.daniilpuris.Lesson11

fun main(){

    // 1. Пустой неизменяемый словарь, где ключи и значения — целые числа.
    val emptyMap: Map<Int, Int> = mapOf()
    println(emptyMap)

    // 2. Cловарь, инициализированный несколькими парами "ключ-значение",
    // где ключи — float, а значения — double
    val emptyMap2: Map<Float, Double> = mapOf()
    println(emptyMap2)

    // 3. Изменяемый словарь, где ключи - целые числа, а значения - строки.
    val mutableMap: MutableMap<Int, String> = mutableMapOf(1 to "1")
    println(mutableMap)

    // 4. Добавление в изменяемый словарь новые пары "ключ-значение".
    val mutableMap2: MutableMap<Int, Int> = mutableMapOf(1 to 2)
    mutableMap2[3] = 4
    println(mutableMap2)

    // 5.



}