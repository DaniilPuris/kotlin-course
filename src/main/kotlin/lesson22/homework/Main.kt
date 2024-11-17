package com.daniilpuris.lesson22.homework

fun main(){

    // ArrayExt
    val numArr: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(numArr.ArrNumericPair())

    // NullChairExt
    val nullChar: Char? = null
    println(nullChar.NullChair(
        arg1 = 1,
        arg2 = 2,
        arg3 = true
    ))

    // MutableListExt
    val mutableList: MutableList<Any?> = mutableListOf(1, 2, 3)
    println(mutableList.elementList(arg1 = "3", arg2 = 2))
}
    // NullLongExt


