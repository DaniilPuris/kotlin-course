package com.daniilpuris.lesson18.homework

class Cart {
    private val items = mutableMapOf<Int, Int>()

    fun addToCart(itemId: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + 1
    }

    fun addToCart(itemId: Int, amount: Int) {
        items[itemId] = items.getOrDefault(itemId, 0) + amount
    }

    fun addToCart(itemsToAdd: Map<Int, Int>) {
        for ((id, amount) in itemsToAdd) {
            items[id] = items.getOrDefault(id, 0) + amount
        }
    }

    fun addToCart(itemIds: List<Int>) {
        for (id in itemIds) {
            items[id] = items.getOrDefault(id, 0) + 1
        }
    }

    override fun toString(): String {
        val builder = StringBuilder("Содержимое корзины:\n")
        var totalQuantity = 0
        var totalItems = 0

        for ((itemId, quantity) in items) {
            builder.append("Товар ID: $itemId, Количество: $quantity\n")
            totalQuantity += quantity
            totalItems++
        }

        builder.append("Всего артикулов: $totalItems\n")
        builder.append("Общее количество товаров: $totalQuantity\n")
        return builder.toString()
    }
}

fun main() {
    val cart = Cart()

    cart.addToCart(1)
    cart.addToCart(2, 3)
    cart.addToCart(mapOf(3 to 5, 4 to 2))
    cart.addToCart(listOf(5, 6, 1))

    println(cart)
}
