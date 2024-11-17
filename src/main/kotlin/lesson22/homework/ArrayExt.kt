package com.daniilpuris.lesson22.homework

// Определение функции-расширения для массива чисел, которая не принимает аргументов и возвращает пару из чисел.

fun Array<Int>.ArrNumericPair(): Pair<Int, Int>? {
    if (this.isEmpty()) return null
    if (this.size < 2) return null

    return Pair(this[0], this[1])
}