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

    // 5. Извлечение значения из предыдущего словаря, используя ключ.
    // Получение значения с ключом, которого в словаре нет.
    val value1 = mutableMap2[1]
    val value2 = mutableMap2[4]
    println(value1)
    println(value2)

    // 6. Удаление определенного элемента из изменяемого словаря по его ключу.
    mutableMap2.remove(3)
    println(mutableMap2)

    // 7. Создание словаря (ключи Double, значения Int)
    // и вывеодим в цикле результат деления ключа на значение.
    // Обработка деления на 0 (в этом случае выводим слово “бесконечность”)
    val map: Map<Double, Int> = mapOf(
    1.0 to 1,
    2.0 to 2,
    3.0 to 3,
    4.0 to 0
    )



