package com.daniilpuris.lesson24.homework

fun main(){

    // NullPointerException
//    val a: Int? = null
//    println(a!!)

    // ArrayIndexOutOfBoundsException
//    val b:Array<Int> = arrayOf(1)
//    println(b[2])

    // ClassCastException
//    val c: Any = 1
//    val number = c as String

    // NumberFormatException
//    val d = "d".toInt()

    // IllegalArgumentException

    // IllegalStateException

    // OutOfMemoryError
//    var outOfMemoryList = mutableListOf("data1", "data2")
//    while (true) {
//        outOfMemoryList.add("More data")
//    }

    // StackOverflowError
    stackOverflowError()

}

// StackOverflowError
fun stackOverflowError(){
    fun stackOverflowError(){}
}