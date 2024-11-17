package com.daniilpuris.lesson21.homework

/* Интерфейс Mapper<T, R>, который определяет метод
   для преобразования элементов типа T в элементы типа R.
 */

interface Mapper<T, R> {
    fun mapper(el: T): R
    fun mapperList(el: List<T>): List<R>
}