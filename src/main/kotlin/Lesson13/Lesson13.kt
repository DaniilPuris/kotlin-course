package com.daniilpuris.Lesson13

fun main(){
    val intCollection = listOf(1, 2, 3, 4, 5)
    val stringsCollection = listOf("a", "b", "b", "c", "d")

// 1.
// Проверить, что размер коллекции больше 5 элементов.
    println(intCollection.size > 5)

// Проверить, что коллекция пустая
    println(intCollection.isEmpty())

// Проверить, что коллекция не пустая
    println(intCollection.isNotEmpty())

// Взять элемент по индексу или создать значение если индекса не существует
    println(intCollection.getOrElse(3) { 6 })

// Собрать коллекцию в строку
    println(intCollection.joinToString(" "))

// Посчитать сумму всех значений
    println(intCollection.sum())

// Посчитать среднее
    println(intCollection.average())

// Взять максимальное число
    println(intCollection.max())

// Взять минимальное число
    println(intCollection.min())

// Взять первое число или null
    println(intCollection.firstOrNull())

// Проверить что коллекция содержит элемент
    println(intCollection.contains(4))

// Отфильтровать коллекцию по диапазону 18-30
    println(intCollection.filter { it in 18..30 })

// Выбрать числа, которые не делятся на 2 и 3 одновременно
    println(intCollection.filterNot { it % 2 == 0 && it % 3 == 0 })

// Очистить текстовую коллекцию от null элементов
    println(intCollection.filterNotNull())

// Преобразовать текстовую коллекцию в коллекцию длин слов
    println(intCollection.map {"$it".length})

// Преобразовать текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова
    println(stringsCollection.map { it to it.reversed() })

// Отсортировать список в алфавитном порядке
    println(stringsCollection.sorted())

// Отсортировать список по убыванию
    println(stringsCollection.sortedDescending())

// Распечатать квадраты элементов списка
    println(intCollection.map { it * it })

// Группировать список по первой букве слов
    println(stringsCollection.groupBy { it.firstOrNull() })

// Очистить список от дублей
    println(stringsCollection.distinct())

// Взять первые 3 элемента списка
    println(intCollection.take(3))

// Взять последние 3 элемента списка
    println(intCollection.takeLast(3))

/*
2. Метод, который принимает коллекцию чисел
   и возвращает строку с текущим состоянием коллекции используя конструкцию when
*/

// Если коллекция пустая — “Пусто
    val empty = listOf<Int>()
    println(characterizationOfCollection(empty))

// Если количество элементов меньше пяти — “Короткая”
    val short = listOf<Int>(1, 2, 3)
    println(characterizationOfCollection(short))

// Если коллекция начинается с 0 — “Стартовая”
    val starting = listOf<Int>(1, 2, 3, 4, 5)
    println(characterizationOfCollection(starting))

// Если сумма всех чисел больше 10000 — “Массивная”
    val massive = listOf<Int>(100, 500, 1000)
    println(characterizationOfCollection(massive))

// Если среднее значение равно 10 — “Сбалансированная”
    val balanced = listOf<Int>(10, 20, 10, 10, 10)
    println(characterizationOfCollection(balanced))

// Если длина строки образованная склеиванием коллекции в строку равна 20 - “Клейкая”
    val sticky = List(20){ 1 }
    println(characterizationOfCollection(sticky))

// Если максимальное число меньше -10 — “Отрицательная”
    val negative = listOf<Int>(10, -10, -20)
    println(characterizationOfCollection(negative))

// Если минимальное число больше 1000 — “Положительная”
    val positive = listOf<Int>(1001, 1002, 1003)
    println(characterizationOfCollection(positive))

// Если содержит одновременно числа 3 и 14 — “Пи***тая”
    val fuckingAwesome = listOf<Int>(3, 6, 8, 14)
    println(characterizationOfCollection(fuckingAwesome))

// Иначе - “Уникальная”
    val unique = listOf<Int>(1)
    println(characterizationOfCollection(unique))


}

fun characterizationOfCollection(intList: List<Int>): String {
    return when {
        intList.isEmpty() -> "Пусто"
        intList.size < 5 -> "Короткая"
        intList.getOrNull(0) == 0 -> "Стартовая"
        intList.sum() > 10000 -> "Массивная"
        intList.min() > 1000 -> "Положительная"
        intList.average() == 10.0 -> "Сбалансированная"
        intList.joinToString("").length == 20 -> "Клейкая"
        intList.max() <= -10 -> "Отрицательная"
        intList.contains(3) && intList.contains(14) -> "Пи***тая"
        else -> "Уникальная"
    }
}