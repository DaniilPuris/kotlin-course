package com.daniilpuris.lesson22.homework

/* Функция-расширение для класса символа, допускающего null,
   которая принимает три аргумента: два типа число и один булево,
   и ничего не возвращает.
*/

fun Char?.NullChair(arg1: Int, arg2: Int, arg3: Boolean) {
    if (this == null) {
        println("Null")
        return
    }
}