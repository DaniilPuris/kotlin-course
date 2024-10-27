package com.daniilpuris.Lesson14

fun main(){

/* 1. Среднее время выполнения теста в словаре с именем
      и временем выполнения каждого автоматизированного теста в секундах
*/
    val autotestExecutionTime = mapOf<String, Double>(
        "Unit tests" to 10.2,
        "Smoke test" to 3.0,
        "Load tests" to 200.4
    )
    val averageTime = autotestExecutionTime.values.average()
    println("Среднее время выполнения тестов: $averageTime")

/* 2. Словарь с метаданными автоматизированных тестов,
      где ключи — это имена тестовых методов, а значения — строка с метаданными.
      Выводим список всех тестовых методов.
*/
    val automatedTestMetadata = mapOf<String, String>(
        "Black box" to "Frontend, functionality",
        "White box" to "Unit tests",
        "Gray box" to "API tests, databases"
    )
    val methods: List<String> = automatedTestMetadata.keys.toList()
    println(methods)

/* 3. В изменяемый словарь с данными о прохождении тестов
      добавляем новый тест и его результат.
*/
    var testResults = mutableMapOf<String, String>(
        "Unit tests" to "passed",
        "Smoke test" to "passed",
        "Load tests" to "failed"
    )
    testResults["API tests"] = "passed"
    println(testResults)

// 4. Подсчет количества успешных тестов в словаре с результатами.
    val testPassRate = testResults.count { it.value == "passed" }
    println(testPassRate)

/* 5. Удаление из изменяемого словаря с баг-трекингом запись о баге,
      который был исправлен.
*/
    var bagReports = mutableMapOf<String, String>(
        "bugName1" to "bugreport1",
        "bugName2" to "bugreport2",
        "bugName3" to "bugreport3"
    )
    bagReports.remove("bugName3")
    println(bagReports)

/* 6. Для словаря с результатами тестирования веб-страниц
      (ключ — URL страницы, значение — статус ответа),
      выводим сообщение о странице и статусе её проверки.
*/
    val webPageTestResults = mapOf<String, String>(
        "https://page1.сom" to "passed",
        "https://page2.сom" to "in progress",
        "https://page3.сom" to "failed"
    )
    webPageTestResults.forEach { (page, status) ->
        println("$page — $status")
    }
/* 7. Поиск в словаре с названием и временем ответа сервисов только те,
      время ответа которых превышает заданный порог.
*/
    val serviceResponseTime = mapOf<String, Double>(
        "Сatalog" to 0.7,
        "Basket" to 0.5,
        "Payment page" to 1.1
    )
    serviceResponseTime.forEach { (service, time) ->
        if (time > 0.8) {
            println("$service: $time")
        }
    }
/* 8. В словаре хранятся результаты тестирования API
      (ключ — endpoint, значение — статус ответа в строке).
      Для указанного endpoint ищем статус ответа,
      если endpoint отсутствует, предполагаем, что он не был протестирован.
*/
    val apiTestsResults = mapOf<String, Int>(
    "endpoint1" to 403,
    "endpoint2" to 200,
    "endpoint3" to 500
    )
    val endpoint = "endpoint4"
    val status = apiTestsResults.getOrElse(endpoint) { "untested" }
    println("$endpoint — $status")

/* 9. Из словаря, содержащего конфигурации тестового окружения
      (ключ — название параметра конфигурации),
      получение значения для "browserType". Ответ не может быть null.
*/
    val testEnvironmentConfigurations = mapOf<String, String>(
        "testServer" to "param1",
        "localBuild" to "param2",
        "browserType" to "param3"
    )
    val browserType = testEnvironmentConfigurations
        .getOrDefault("browserType", "")
    println("$browserType")


/* 10. Создание копии неизменяемого словаря с данными о версиях тестируемого ПО,
       чтобы добавить новую версию.
*/
    val softwareTestVersions = mapOf<String, Double>(
        "software1" to 1.0,
        "software2" to 3.2,
        "software3" to 2.2
    )
    val softwareTestVersions2 = softwareTestVersions + ("software4" to 3.5)
    println("$softwareTestVersions2")

/* 11. Используя словарь с настройками тестирования для различных мобильных устройств
       (ключ — модель устройства), получаем настройки для конкретной модели
       или возвращаем настройки по умолчанию.
*/
    val mobileDevicesTestSettings = mapOf<String, String>(
        "model1" to "settings1",
        "model2" to "settings2",
        "model3" to "settings3"
    )
    val model3 = mobileDevicesTestSettings.getOrDefault(
        "model3", "DefaultSettings"
    )
    println("$model3")

/* 12. Проверка, содержит ли словарь с ошибками тестирования
       (код и описание) определенный код ошибки.
*/
    val testErrors = mapOf<Int, String>(
        100 to "Description1",
        200 to "Description2",
        300 to "Description2"
    )
    val e400 = testErrors.containsKey(400)
    println("$e400")

/* 13. Неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев
       в формате "TestID_Version", а значения — статусы выполнения этих тестов
       ("Passed", "Failed", "Skipped").
       Отфильтруйте словарь, оставив только те сценарии,
       идентификаторы которых соответствуют определённой версии тестов.
*/
    val testStatuses = mapOf<String, String>(
        "TestID_Version_1" to "Passed",
        "TestID_Version_2" to "Failed",
        "TestID_Version_3" to "Skipped"
    )
    val versionToFilter = "Version_3"
    val testCasesFilter = testStatuses.filterKeys { key ->
        key.contains(versionToFilter)
    }
    println(testCasesFilter)

/* 14. Словарь, где ключи — это названия функциональных модулей приложения,
       а значения — результаты их тестирования.
       Проверяем, есть ли модули с неудачным тестированием
*/
    val functionalModules = mapOf<String, String>(
        "module1" to "Passed",
        "module2" to "Failed",
        "module3" to "Failed",
    )
println(functionalModules.any {it.value == "Failed"})
}
/* 15.
*/

/* 16.
*/