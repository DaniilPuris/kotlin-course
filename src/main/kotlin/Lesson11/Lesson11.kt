package com.daniilpuris.Lesson11

fun main() {

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
        3.0 to 4,
        5.0 to 6,
        7.0 to 0
    )
    for ((key, value) in map) {
        if (value != 0) {
            println("${key / value}")
        } else {
            println("бесконечность")
        }
    }

    // 8. Изменение значений для существующего ключа в изменяемом словаре.
    val mutableMap3: MutableMap<Int, Int> = mutableMapOf(1 to 2)
    mutableMap3[1] = 3
    println(mutableMap3)

    // 9. Объединение двух словарей в третьем изменяемом словаре через циклы.
    val map2: Map<Int, Int> = mapOf(1 to 2)
    val map3: Map<String, String> = mapOf("Строка" to "Строка2")
    val mutableMap4: MutableMap<Any, Any> = mutableMapOf<Any, Any>()
    for ((key, value) in map2) {
        mutableMap4[key] = value
    }
    for ((key, value) in map3) {
        mutableMap4[key] = value
    }
    println(mutableMap4)

    // 10. Словарь, где ключами являются строки, а значениями — списки целых чисел.
    // Добавление нескольких элементов в этот словарь.
    val mutableMap5: MutableMap<String, List<Int>> = mutableMapOf()
    mutableMap5["ключ1"] = listOf(1, 2, 3)
    mutableMap5["ключ2"] = listOf(4, 5, 6)
    println(mutableMap5)

    // 11. Словарь, в котором ключи — это целые числа, а значения — изменяемые множества строк.
    // Добавление данных в словарь. Получение значения по ключу (множество строк)
    // и добавление в это множество ещё строку. Печать полученного множества.
    val mutableMap6: MutableMap<Int, MutableList<String>> = mutableMapOf(1 to mutableListOf("a", "b"))
    mutableMap6[1] = mutableListOf("a", "b", "c")
    println(mutableMap6)

    // 12. Словарь, где ключи — пары чисел. Поиск значения через перебор
    // у которого пара будет содержать цифру 5 в качестве первого или второго значения.
    val map4: Map<List<Int>, Any> = mapOf(
        listOf(1,2) to "a",
        listOf(3,4) to "b",
        listOf(5,6) to "c"
    )
    //for ((key, value) in map4) {



}


