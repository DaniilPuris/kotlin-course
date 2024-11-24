package com.daniilpuris.lesson24.homework

fun main() {

    // NullPointerException
    try {
        val a: Int? = null
        println(a!!)
    } catch (e: Exception) {
        println("Ошибка NullPointerException")
    }

    // ArrayIndexOutOfBoundsException
    try {
        val b: Array<Int> = arrayOf(1)
        println(b[2])
    } catch (e: Exception) {
        println("Ошибка ArrayIndexOutOfBoundsException")
    }

    // ClassCastException
    try {
        val c: Any = 1
        val number = c as String
    } catch (e: Exception) {
        println("Ошибка ClassCastException")
    }

    // NumberFormatException
    try {
        val d = "d".toInt()
    } catch (e: Exception) {
        println("Ошибка NumberFormatException")
    }

    // IllegalArgumentException
    try {
        val illegalArgumentException = false
        require(illegalArgumentException)
    } catch (e: Exception) {
        println("Ошибка illegalStateException")
    }

    // OutOfMemoryError
    try {
        var outOfMemoryList = mutableListOf("data1", "data2")
        while (true) {
            outOfMemoryList.add("More data")
        }
    } catch (e: OutOfMemoryError) {
        println("Ошибка OutOfMemoryError")
    }

    // StackOverflowError
    try {
        stackOverflowError()
    } catch (e: StackOverflowError) {
        println("Ошибка StackOverflowError")
    }

}

// StackOverflowError
fun stackOverflowError() {
    stackOverflowError()
}