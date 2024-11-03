package com.daniilpuris.lesson17.homework

// Иерархия классов с расширением базовой сущности.

open class Furniture (
    val name: String
)

open class storageFurniture (
    name: String,
    val capacity: Float
) : Furniture(name)

class Nightstand (
    name: String,
    capacity: Float,
    val shelvesNumber: Int
) : storageFurniture(name, capacity)

open class sittingAndLyingFurniture (
    name: String,
    val accommodationCapacity: Int
) : Furniture(name)

class sofa (
    name: String,
    accommodationCapacity: Int,
    val material: String
) : sittingAndLyingFurniture(name, accommodationCapacity)