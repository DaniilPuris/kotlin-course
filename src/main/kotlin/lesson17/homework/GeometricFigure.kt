package com.daniilpuris.lesson17.homework

// Иерархия классов с расширением базовой сущности.

open class GeometricFigure (
    val name: String
)

open class Polygon (
    name: String,
    val sidesNumber: Int
) : GeometricFigure(name)

class Triangle (
    name: String,
    sidesNumber: Int,
    val classification: String
) : Polygon(name, sidesNumber)

class Quadrilateral (
    name: String,
    sidesNumber: Int,
    val type: String
) : Polygon(name, sidesNumber)

class Circle (
    name: String,
    val diameter: Float
) : GeometricFigure(name)