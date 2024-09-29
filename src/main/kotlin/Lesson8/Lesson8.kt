package com.daniilpuris.Lesson8

fun main() {
    extractDate(log)
    println(maskedCard)
    println(formattedEmail)
    println(fileName)
    println(abbreviation)
}

// Функция, которая анализирует входящие фразы и применяет к ним преобразования,
// делая текст более ироничным или забавным.
// Функция умеет распознавать ключевые слова или условия и соответственно изменяет фразу.


//Задание 1: Извлечение даты из строки лога. indexOf или split для получения правой части сообщения.
//Есть строка лога вида "Пользователь вошел в систему -> 2021-12-01 09:48:23".
// Извлечение отдельно даты и времени из строки и сразу вывод их по очереди.
val log = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
fun extractDate(log: String) {
    val parts = log.split(" -> ")
    val date = parts[1]
    println(date)
}

// Задание 2: Маскирование Личных Данных
// Дана строка с номером кредитной карты "4539 1488 0343 6467". Замаскируйте все цифры, кроме последних четырех, символами "*".
val cardNumber = "4539 1488 0343 6467"
val maskedCard = maskCreditCard(cardNumber)
fun maskCreditCard(cardNumber: String): String {
    val lastFourDigits = cardNumber.takeLast(4)
    val maskedPart = cardNumber.dropLast(4).replace(Regex("\\d"), "*")
    return maskedPart + lastFourDigits
}

// Задание 3: Форматирование Адреса Электронной Почты. Использование replace
// Есть электронный адрес "username@example.com". Преобразование его в строку "username [at] example [dot] com".
val email = "username@example.com"
val formattedEmail = formatEmail(email)
fun formatEmail(email: String): String {
    return email.replace("@", " [at] ").replace(".", " [dot] ")
}

// Задание 4: Извлечение Имени Файла из Пути
// Дан путь к файлу "C:/Пользователи/Документы/report.txt". Извлечение названия файла с расширением.
val filePath = "C:/Пользователи/Документы/report.txt"
val fileName = extractFileName(filePath)
fun extractFileName(filePath: String): String {
    return filePath.substringAfterLast('\\').substringAfterLast('/')
}

// Задание 5: Создание Аббревиатуры из Фразы. Использование split с набором символов для разделения.
// Использование for для перебора слов. Использование var переменной для накопления первых букв.
// Есть фраза, например "Объектно-ориентированное программирование".
// Создание аббревиатуры из начальных букв слов (например, "ООП").
val phrase = "Объектно-ориентированное программирование"
val abbreviation = createAbbreviation(phrase)
fun createAbbreviation(phrase: String): String {
    val words = phrase.split(" ", "-", "_")
    var abbreviation = ""

    for (word in words) {
        if (word.isNotEmpty()) {
            abbreviation += word[0].uppercase()
        }
    }
    return abbreviation
}
