package com.daniilpuris.Lesson6

fun main() {
    println(season)
    println(humanAge)
    println(optimalTransport)
    println(bonusPointsNumber)
    println(type)
}

// 1. Функция, которая возвращает сезон года на основе номера месяца.

var month = 1
val season = seasons(month)

fun seasons(month: Int): String {
    return when (month) {
        12, 1, 2 -> "Зима"
        3, 4, 5 -> "Весна"
        6, 7, 8 -> "Лето"
        9, 10, 11 -> "Осень"
        else -> "Некорректный номер месяца"
    }
}


// 2. Функция, которая преобразует возраст собаки в "человеческие" годы.
// До 2 лет каждый год собаки равен 10.5 человеческим годам, после — каждый год равен 4 человеческим годам.

val dogsAge: Int = 5
val humanAge = dogInHumanAge(dogsAge)

fun dogInHumanAge (dogsAge: Int): Double {
    return if (dogsAge <= 2) {
        dogsAge * 10.5
    } else {
        2 * 10.5 + (dogsAge - 2) * 4
    }
}

// 3. Функция, которая определяет, какой вид транспорта лучше использовать, исходя из длины маршрута.
// Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".

val routeLength: Int = 6
val optimalTransport = optimalTransportSelection(routeLength)

fun optimalTransportSelection (routeLength: Int): String {
    return when {
        routeLength <= 1 -> "пешком"
        routeLength <= 5 -> "велосипед"
        else -> "автотранспорт"
    }
}


// 4. Клиенты интернет-магазина получают бонусные баллы за покупки.
// Функция, которая принимает сумму покупки и возвращает количество бонусных баллов:
// 2 балла за каждые 100 рублей при сумме покупки до 1000 рублей и 5 баллов за каждые 100 рублей при сумме свыше этого.

val purchaseAmount: Int = 1100
val bonusPointsNumber = calculateBonusPointsNumber (purchaseAmount)

fun calculateBonusPointsNumber (purchaseAmount: Int): Int {
    val dif = purchaseAmount / 100
    return if (purchaseAmount <= 1000) {
        purchaseAmount * 2
    } else {
        purchaseAmount * 5
    }
}


// 5. Контекст: В системе хранения документов каждый файл имеет расширение.
// Функция, которая на основе расширения файла возвращает его тип:
// "Текстовый документ", "Изображение", "Таблица" или "Неизвестный тип".

val fileExtension: String = "txt"
val type = typeDeterminant(fileExtension)

fun typeDeterminant (fileExtension: String): String {
    return when (fileExtension) {
        "txt" -> "Текстовый документ"
        "jpeg", "png" -> "Изображение"
        "xlsx" -> "Таблица"
        else -> "Неизвестный тип"
    }
}

// 6. Функция, которая конвертирует температуру из градусов Цельсия в Фаренгейты и наоборот
// в зависимости от указанной единицы измерения (C/F).
// Единицу измерения нужно передать вторым аргументом функции. Несколько аргументов передаются через запятую.
// Возвращать нужно строку.
//Подсказка: для генерации строки из числа и буквы можно использовать шалон “$result F” для фаренгейта или “$result C” для цельсия

