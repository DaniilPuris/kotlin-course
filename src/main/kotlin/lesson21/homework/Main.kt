package com.daniilpuris.lesson21.homework

fun main(){

}

/* Функция toMap<K, V>(keys: List<K>, values: List<V>): Map<K, V>,
   которая создает карту из списков ключей и значений.
   Если ключей или значений больше, то оставшиеся ключи или значения
   не записываем в словарь.
*/

fun <K, V> toMap (keys: List<K>, values: List<V>): Map<K, V> {
    val result: MutableMap<K, V> = mutableMapOf()
    for (i in 0..minOf(keys.size, values.size)) {
        result[keys[i]] = values[i]
    }
    return result
}

/* Функция getMiddleElement<T>(list: List<T>): T?,
   которая возвращает средний элемент списка, если он существует.
*/

fun <T> getMiddleElement(list: List<T>): T? {
   return if (
       list.isNotEmpty()
       && list.size % 2 != 0
       && list.size != 1
   ) {
       list[list.size / 2]
   } else null
}