package com.daniilpuris.Lesson12

fun main(){
   // 1.
    val intNumber = 3
    println(multiplyByTwo(intNumber))

    // 2.
    val number = 3
    println(isEven(number))
}

// Сигнатура функции, которая не принимает аргументов и не возвращает значения.
fun fun1(){}

// Сигнатура функции, которая принимает два целых числа и возвращает их сумму.
fun sum(a: Int = 1, b: Int = 2):Int = a + b

// Сигнатура функции, которая принимает строку и ничего не возвращает.
fun string(a:String){}

// Сигнатура функции, которая принимает список целых чисел
// и возвращает среднее значение типа Double.
fun average(numbers: List<Int>): Double {
    return if (numbers.isNotEmpty()) {
        numbers.sum().toDouble() / numbers.size
    } else {
        0.0
    }
}

// Сигнатура функции, которая принимает nullable строку
// и возвращает её длину в виде nullable целого числа.
fun getStringLength(input: String?): Int? {
    return input?.length
}

// Сигнатура функции, которая не принимает аргументов
// и возвращает nullable вещественное число.
fun getNull(): Double? = 1.0

// Сигнатура функции, которая принимает nullable список целых чисел
// и не возвращает значения.
fun nullList(numbers: List<Int?>?){}

// Сигнатура функции, которая принимает целое число и возвращает nullable строку.
fun intNullString(number: Int):String? = null

// Сигнатура функции, которая не принимает аргументов
// и возвращает список nullable строк.
fun getNullStringList(): List<String?> = listOf("")

// Сигнатура функции, которая принимает nullable строку
// и nullable целое число и возвращает nullable булево значение.
fun getNullBoolean(nulString: String?, nullInt: Int?):Boolean? = null

// 1. Функция multiplyByTwo, которая принимает целое число
// и возвращает его, умноженное на 2.
fun multiplyByTwo(intNumber:Int):Int = intNumber * 2

// 2. Функция isEven, которая принимает целое число
// и возвращает true, если число чётное, и false в противном случае.
fun isEven(number: Int): Boolean {
        return number % 2 == 0
    }
