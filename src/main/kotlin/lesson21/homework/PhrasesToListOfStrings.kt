package com.daniilpuris.lesson21.homework

/* Класс PhrasesToListOfStrings и имплементация интефрейса Mapper
   с типами String и List<String>.
   Метод преобразования разбивает входящую строку по символу пробела
   и возвращать список из полученных слов.
 */

class PhrasesToListOfStrings: Mapper<String, List<String>> {

    override fun mapper(el: String) = el.split(" ")

    override fun mapperList(el: List<String>): List<List<String>> {
        return el.map {
            it.split(" ")
        }
    }
}