package com.daniilpuris.lesson22.homework

/* Функция-расширение для класса длинного числа, допускающее null,
   которая не принимает аргументов и возвращает строку.
 */

fun Long?.toDescription(): String {
    return when {
        this == null -> "Null"
        else -> "Not null"
    }
}
