package com.daniilpuris.lesson31.homework

import com.google.gson.GsonBuilder
import java.io.File

fun main() {

    // Иерархия сотрудников
    val developer1 = Employee(
        name = "Алексей",
        isEmployed = true,
        dateOfBirth = "1995-03-15",
        position = CharacterTypes.DEVELOPER
    )

    val developer2 = Employee(
        name = "Мария",
        isEmployed = true,
        dateOfBirth = "1993-07-22",
        position = CharacterTypes.DEVELOPER
    )

    val qa = Employee(
        name = "Елена",
        isEmployed = true,
        dateOfBirth = "1994-11-30",
        position = CharacterTypes.QA
    )

    val designer = Employee(
        name = "Дмитрий",
        isEmployed = true,
        dateOfBirth = "1992-05-18",
        position = CharacterTypes.DESIGNER
    )

    val teamLead1 = Employee(
        name = "Иван",
        isEmployed = true,
        dateOfBirth = "1990-08-25",
        position = CharacterTypes.TEAMLEAD,
        subordinates = listOf(developer1, developer2, qa)
    )

    val teamLead2 = Employee(
        name = "Анна",
        isEmployed = true,
        dateOfBirth = "1991-04-12",
        position = CharacterTypes.TEAMLEAD,
        subordinates = listOf(designer, developer2)
    )

    val cto = Employee(
        name = "Сергей",
        isEmployed = true,
        dateOfBirth = "1985-01-10",
        position = CharacterTypes.CTO,
        subordinates = listOf(teamLead1, teamLead2)
    )


    // Сериализация CTO в текст с настройкой prettyPrinting.
    val gson = GsonBuilder().setPrettyPrinting().create()
    val json = gson.toJson(cto)

    // Запись текста в файл в корне проекта.
    File("cto.json").writeText(json)

    // Чтение из файла
    val jsonText = File("cto.json").readText()
    
    // Десериализация JSON в объект Employee
    val deserializedCto = gson.fromJson(jsonText, Employee::class.java)
    
    // Вывод в консоль
    println(deserializedCto)

}

enum class CharacterTypes(val description: String) {
    CTO("CTO"),
    TEAMLEAD("Team lead"),
    DEVELOPER("Developer"),
    QA("QA"),
    DESIGNER("Designer")
}