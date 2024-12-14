package com.daniilpuris.lesson29.homework

import java.time.*
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal

fun main() {
  
    // Текущая временнАя метка и выведи её на печать.
    val currentTime = LocalDateTime.now()
    println(currentTime)

    // Дата своего дня рождения.
    val myBirthday = LocalDate.of(1995, 1, 6)
    println(identifyGeneration(myBirthday))

    // Период между датой своего рождения и текущей датой. 
    // Вывод на печать количество лет из этого периода.
    val period = Period.between(myBirthday, currentTime.toLocalDate())
    println(period.years)

    
    val localDateTime = LocalDateTime.now()
    val zonedDateTime = ZonedDateTime.now()
    val localDate = LocalDate.now()
    val localTime = LocalTime.now()
    
    println("Собственное форматирование:")
    println(formatTemporalCustom(localDateTime))
    println(formatTemporalCustom(zonedDateTime))
    println(formatTemporalCustom(localDate))
    println(formatTemporalCustom(localTime))
    
    println("\nISO форматирование:")
    println(formatTemporalISO(localDateTime))
    println(formatTemporalISO(zonedDateTime))
    println(formatTemporalISO(localDate))
    println(formatTemporalISO(localTime))

}

// Функция, которая принимает тип Temporal и выводит форматированное значение в зависимости от того,
    // содержит ли аргумент время и часовой пояс. 
    // Temporal - это общий тип для разных классов даты-времени. 
    // В форматированном значении нужно выводить часы, минуты, секунды и таймзону, 
    // если они представлены в переданном объекте. Обработай в методе все типы дат, которые знаешь. 
    // Реализуй два варианта функции — с собственный форматированием и с форматами из ISO коллекции.

fun formatTemporalCustom(temporal: Temporal): String {
    return when (temporal) {
        is LocalDateTime -> {
            val time = temporal.toLocalTime()
            "Дата: ${temporal.toLocalDate()}, " +
            "Время: ${time.hour}:${time.minute}:${time.second}"
        }
        is ZonedDateTime -> {
            val time = temporal.toLocalTime()
            "Дата: ${temporal.toLocalDate()}, " +
            "Время: ${time.hour}:${time.minute}:${time.second}, " +
            "Зона: ${temporal.zone}"
        }
        is LocalDate -> {
            "Дата: $temporal"
        }
        is LocalTime -> {
            "Время: ${temporal.hour}:${temporal.minute}:${temporal.second}"
        }
        else -> "Неподдерживаемый формат времени"
    }
}

fun formatTemporalISO(temporal: Temporal): String {
    return when (temporal) {
        is LocalDateTime -> temporal.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
        is ZonedDateTime -> temporal.format(DateTimeFormatter.ISO_ZONED_DATE_TIME)
        is LocalDate -> temporal.format(DateTimeFormatter.ISO_LOCAL_DATE)
        is LocalTime -> temporal.format(DateTimeFormatter.ISO_LOCAL_TIME)
        else -> "Неподдерживаемый формат времени"
    }
}


// Функция identifyGeneration, которая принимает дату рождения в формате LocalDate 
// и печатает строку, определяющую, к какому поколению принадлежит человек: 
// "Бумер" для тех, кто родился с 1946 по 1964 год включительно, 
// и "Зумер" для тех, кто родился с 1997 по 2012 год включительно. 
// Если дата рождения не попадает ни в один из этих диапазонов, 
// функция должна возвращать "Не определено". 
// Для сравнения дат используй методы isAfter(otherDate) и isBefore(otherDate). 
// Объекты с эталонными датами вынеси в приватные поля файла с методом identifyGeneration.

val boomersStart = LocalDate.of(1946, 1, 1)
val boomersEnd = LocalDate.of(1964, 12, 31)
val zoomersStart = LocalDate.of(1997, 1, 1)
val zoomersEnd = LocalDate.of(2012, 12, 31)

fun LocalDate.isInRange(start: LocalDate, end: LocalDate): Boolean {
    return (this.isAfter(start) || this.isEqual(start)) && (this.isBefore(end) || this.isEqual(end))
}

fun identifyGeneration(birthday: LocalDate): String {
    return when {
        birthday.isInRange(boomersStart, boomersEnd) -> "Бумер"
        birthday.isInRange(zoomersStart, zoomersEnd) -> "Зумер"
        else -> "Не определено"
    }
}