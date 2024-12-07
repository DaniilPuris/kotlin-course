package com.daniilpuris.lesson27.homework

fun main() {

    val employee = Employee("Daniil", 29, "QA Engineer").apply {
        email = "Daniil@example.com"
        department = "IT"
        println("Email: $email")
        println("Department: $department")
    }

    val person = Person("Daniil", 29).also {
        it.email = "Daniil@example.com"
        printPersonLogs(it)
    }

    val employee2 = with(person) {
        Employee(name, age, "QA Engineer")
    }

}

fun printPersonLogs(person: Person) {
    println("Name: ${person.name}")
    println("Age: ${person.age}")
    println("Email: ${person.email}")
}
