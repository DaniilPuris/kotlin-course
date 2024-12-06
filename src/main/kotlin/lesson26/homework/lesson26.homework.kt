package com.daniilpuris.lesson26.homework

fun main() {

    val words = listOf("aa", "bb", "cc", "dd", "eeeeee")

    val result = filterStrings(words) { it.length > 2 }

    println(result)

}

// Функция, которая принимает другую функцию без аргументов и возвращаемого значения.

fun fun1(arg: () -> Unit) {}


// Функция, которая принимает функцию с одним аргументом типа Int и возвращающую String.

fun fun2(arg: (Int) -> String) {}


// Функция, которая принимает функцию расширения типа Int, принимающую String и возвращающую Boolean.

fun fun3(arg: Int.(String) -> Boolean) {}


// Функция, которая принимает функцию с двумя аргументами типа Double и возвращает Boolean.

fun fun4(arg: (Double, Double) -> Boolean) {}


// Функция, которая принимает функцию с одним аргументом-дженериком T и возвращает List<T>.

fun <T> fun5(arg: (T) -> List<T>) {}


// Функция, которая принимает функцию с аргументом типа String и возвращающую другую функцию, принимающую Int и возвращающую Boolean.

fun fun6(arg: (String) -> (Int) -> Boolean) {}


// Функция, которая принимает список чисел, множество строк, функцию с аргументами типа List<Int> и Set<String> и возвращающую Map<String, Int>.

fun fun7(
    numbers: List<Int>,
    strings: Set<String>,
    func: (List<Int>, Set<String>) -> Map<String, Int>
) {}


// Функция, возвращающая строку, принимающую число и функцию, принимающую число и возвращающую строку

fun fun8(
    number: Int,
    func: (Int) -> String
): String {
    return func(number)
}

// Функция, которая принимает функцию, которая возвращает функцию без аргументов и возвращаемого значения.

fun fun9(arg: () -> () -> Unit) {}


// Функция filterStrings, которая принимает список строк и функцию-фильтр, оставляющую только строки, удовлетворяющие условию
// (то-есть принимающая строку и возвращающая булево значение). Функция должна вернуть результат фильтрации исходного списка строк.

fun filterStrings(
    strings: List<String>,
    filter: (String) -> Boolean
): List<String> {
    return strings.filter(filter)
}