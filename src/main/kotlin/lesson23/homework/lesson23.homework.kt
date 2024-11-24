package com.daniilpuris.lesson23.homework

fun main() {

    /*
    Функция analyzeDataType, принимающая параметр типа Any. Функция определяет тип аргумента и выводит соответствующее сообщение:
    Для строки: "Это строка: [значение]".
    Для целого числа: "Это целое число: [значение]".
    Для списка: "Это список, количество элементов: [количество]".
    Для карты: "Это карта, количество пар: [количество]".
    Для остальных типов: "Неизвестный тип данных".
    Используется оператор is для проверки типов.
    */

    fun analyzeDataType(value: Any) {
        when (value) {
            is String -> println("Это строка: $value")
            is Int -> println("Это целое число: $value")
            is List<*> -> println("Это список, количество элементов: $value")
            is Map<*, *> -> println("Это карта, количество пар: $value")
            else -> println("Неизвестный тип данных $value")
        }
    }

    analyzeDataType("Hi")
    analyzeDataType(1)
    analyzeDataType(listOf(1, 2, 3))
    analyzeDataType(listOf("Ab", "Cd", "Ef"))
    analyzeDataType(mapOf("a" to 1, "b" to 2))
    analyzeDataType(1.1)


    /*
    Функция safeCastToList, принимает параметр типа Any и возвращает размер списка, если аргумент можно безопасно привести к типу List.
    В случае неудачного приведения функция должна возвращать -1. Использование as? для безопасного приведения типа.
    */

    fun safeCastToList(value: Any): Int {
        val list = value as? List<*>
        return list?.size ?: -1
    }

    println(safeCastToList("Hi"))
    println(safeCastToList(listOf(1, 2, 3)))


    /*
    Функция getStringLengthOrZero, которая принимает параметр типа Any? и возвращает длину строки,
    если аргумент можно привести к типу String. В случае, если аргумент равен null или не является строкой, функция возвращает 0.
    */

    fun getStringLengthOrZero(value: Any?): Int {
        val toSring = value as? String
        return toSring?.length ?: 0
    }

    println(getStringLengthOrZero("Hi"))
    println(safeCastToList(listOf(1, 2, 3)))


    }