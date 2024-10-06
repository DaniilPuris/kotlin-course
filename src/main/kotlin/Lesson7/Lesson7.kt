package com.daniilpuris.Lesson7

import com.daniilpuris.Lesson6.*

fun main() {
    directRange()
    directRange2()
    reverseRange()
    reverseRange2()
    withStep()
    withStep2()
    usingUntil()
    usingUntil2()
    whileCycle()
    whileCycle2()
    doWhile()
    doWhile2()
    usingBreak()
    usingBreak2()
    usingСontinue()
    usingСontinue2()
    nestedCycle()
}
//Цикл for, который выводит числа от 1 до 5.
fun directRange () {
    for (i in 1..5) {
        println(i)
    }
}
//Цикл for, который выводит четные числа от 1 до 10.
fun directRange2 (){
    for (i in 1..10){
        if (i % 2 == 0)
        println(i)
    }
}
// Цикл for, который выводит числа от 5 до 1.
fun reverseRange (){
    for (i in 5 downTo 1){
        println(i)
    }
}
// Цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
fun reverseRange2(){
    for (i in 10 downTo 1){
        println(i - 2)
    }
}
//Цикл for с шагом 2 для вывода чисел от 1 до 9.
fun withStep(){
    for (i in 1..9 step 2){
        println(i)
    }
}
//Цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
fun withStep2(){
    for (i in 1..20 step 3){
        println(i)
    }
}
//Цикл for и until, чтобы вывести числа из диапазона 1-9 (9 не включается).
fun usingUntil(){
    for (i in 1 until 9){
        println(i)
    }
}
//Цикл for с until, чтобы вывести числа от 3 до 15, не включая 15.
fun usingUntil2(){
    for (i in 3 until 15){
        println(i)
    }
}
//Цикл while, который выводит квадраты чисел от 1 до 5.
fun whileCycle(){
    var i = 1
    while (i <= 5){
        println(i*i)
        i++
    }
}
//Цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
fun whileCycle2(){
    var i = 10
    while (i >= 5){
        println(i)
        i--
    }
}
//Цикл do...while, чтобы вывести числа от 5 до 1.
fun doWhile(){
    var i = 5
    do {
        println(i)
        i--
    } while (i >= 1)
}
//Цикл do...while, который повторяется, пока счетчик меньше 10, начиная с 5.
fun doWhile2(){
    var i = 5
    do {
        println(i)
        i++
    } while (i <= 10)
}
//Цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
fun usingBreak(){
    for (i in 1..10)  {
       if (i == 6) break
        println(i)
    }
}
//Цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
fun usingBreak2(){
    var i = 1
    while (true) {
        if (i == 10) break
        println(i)
        i++
    }
}
//Цикл for от 1 до 10 с continue, чтобы пропустить четные числа.
fun usingСontinue(){
    for (i in 1..10){
        if (i % 2 == 0){
            continue
        }
            println(i)
    }
}
//Цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
fun usingСontinue2(){
    var i = 1
    while (i <= 10){
        if (i % 3 == 0){
            i++
            continue
        }
        println(i)
        i++
    }
}
//Цикл в цикле, в каждом диапазон от 1 до 10.
// В консоль выводим результат умножения переменных цикла.
// Результат умножения выводим через print() и добавляем ещё один print(“ ”) с пробелом,
// чтобы отделять значения в строку.
// После вложенного цикла выводим пустой println() чтобы следующий проход начинать с новой строки.
fun nestedCycle(){
    for (i in 1..10) {
        for (i2 in 1..10) {
            print(i * i2)
            print(" ")
        }
        println()
    }
}
