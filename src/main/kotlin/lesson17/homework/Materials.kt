package com.daniilpuris.lesson17.homework

/* Для обстрактного класса контейнера создаем подклассы,
   которые добавляют строку material в определённое место.
*/

abstract class Materials {

    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
}
    fun extractMaterial(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
}
    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
    }
}
}

// Вставляет строку на дно контейнера (должно появиться под индексом 0)

class MaterialsBottom ()

/* Получает список строк и вставляет их в начало контейнера,
   но поочерёдно с теми данными, которые уже есть.
   То-есть, список появляется в контейнере по индексам 0, 2, 4 и так далее.
*/

/* Добавляет элементы в список в алфавитном порядке.
   Если добавляем новый элемент в список, то он встает между другими элементами
   и занимает место в соответствии с сортировкой по алфавиту.
*/

/* Четвёртый класс должен принимать словарь из строк (ключи и значения).
   Каждая пара ключа и значения попадает в контейнер следующим образом — ключ в начало,
   значение в конец.
*/