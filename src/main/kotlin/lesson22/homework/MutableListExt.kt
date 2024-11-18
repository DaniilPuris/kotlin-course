package com.daniilpuris.lesson22.homework

/* Создайте функцию-расширение для класса изменяемого списка элементов
   с дженериком, которая принимает два аргумента:
   один типа дженерик, допускающий null, и другой типа число,
   и возвращает значение типа дженерик, допускающий null.
*/

fun <T> MutableList<T>.elementList(arg1: T?, arg2: Int): T? {
    return arg1 ?: getOrNull(arg2)
}