package com.daniilpuris.lesson21.homework

/* Класс ListHolder, который хранит список элементов типа T
   и имеет метод для добавления и получения всех элементов
 */

class ListHolder<T> {
   private val list: MutableList<T> = mutableListOf()

    fun addElement(el: T){
        list.add(el)
    }

    fun getElement(): List<T> {
        return list.toList()
    }
}