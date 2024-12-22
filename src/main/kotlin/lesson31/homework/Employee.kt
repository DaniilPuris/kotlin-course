package com.daniilpuris.lesson31.homework

// Дата класс сотрудника компании Employee, содержащий:
// имя
// статус трудоустройства (булево)
// дата рождения (строка)
// должность CharacterTypes (enum из прошлого урока)
// список подчинённых с типом Emploee

data class Employee(
    val name: String,
    val isEmployed: Boolean,
    val dateOfBirth: String,
    val position: CharacterTypes,
    val subordinates: List<Employee> = emptyList()
)