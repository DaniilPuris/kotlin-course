package com.daniilpuris.lesson31.homework

class CerealStorageImpl(
    override val containerCapacity: Float,
    override val storageCapacity: Float
) : CerealStorage {
    
    private val storage = mutableMapOf<Cereal, Float>()

    init {
        require(containerCapacity >= 0) { 
            "Ёмкость контейнера не может быть отрицательной" 
        }
        require(storageCapacity >= containerCapacity) { 
            "Ёмкость хранилища не должна быть меньше ёмкости одного контейнера" 
        }
    }

    override fun addCereal(cereal: Cereal, amount: Float): Float {
        require(amount >= 0) { "Количество не может быть отрицательным" }
        
        val currentAmount = storage.getOrDefault(cereal, 0f)
        val availableSpace = containerCapacity - currentAmount
        
        return when {
            availableSpace >= amount -> {
                storage[cereal] = currentAmount + amount
                0f
            }
            else -> {
                storage[cereal] = containerCapacity
                amount - availableSpace
            }
        }
    }

    override fun getCereal(cereal: Cereal, amount: Float): Float {
        require(amount >= 0) { "Количество не может быть отрицательным" }
        val available = storage.getOrDefault(cereal, 0f)
        return when {
            available >= amount -> {
                storage[cereal] = available - amount
                amount
            }
            else -> {
                storage.remove(cereal)
                available
            }
        }
    }

    override fun removeContainer(cereal: Cereal): Boolean {
        val amount = storage.getOrDefault(cereal, 0f)
        return if (amount == 0f) {
            storage.remove(cereal)
            true
        } else {
            false
        }
    }

    override fun getAmount(cereal: Cereal): Float = storage.getOrDefault(cereal, 0f)
    override fun getSpace(cereal: Cereal): Float {
        val currentAmount = storage.getOrDefault(cereal, 0f)
        return containerCapacity - currentAmount
    }

    override fun toString(): String {
        return storage.entries.joinToString("\n") { (cereal, amount) ->
            "$cereal: $amount"
        }
    }
}