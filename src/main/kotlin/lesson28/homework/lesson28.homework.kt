package com.daniilpuris.lesson28.homework

import java.io.File

fun main() {

// Создаем текстовый файл workspace/task1/example.txt
// пишем в него строку "Hello, Kotlin!", а затем проверяем, существует ли файл.

val directory = File("workspace/task1")
directory.mkdirs()

val file = File(directory, "example.txt")
file.writeText("Hello, Kotlin!")

println(file.exists())


// Создаем директорию workspace/task2/testDir
// проверьте, является ли она директорией, и выведите её абсолютный путь.

val testDirectory = File("workspace/task2/testDir")
testDirectory.mkdirs()

println(testDirectory.isDirectory)
println(testDirectory.absolutePath)


// Создаем директорию workspace/task3/structure.
// Внутри директории structure создаем папку myDir с двумя вложенными поддиректориями subDir1 и subDir2.
// Проверяем, что myDir действительно содержит эти поддиректории.

val structureDirectory = File("workspace/task3/structure")
structureDirectory.mkdirs()

val myDir = File(structureDirectory, "myDir")
myDir.mkdirs()

val subDir1 = File(myDir, "subDir1")
val subDir2 = File(myDir, "subDir2")
subDir1.mkdirs()
subDir2.mkdirs()

println("Поддиректории в myDir:")
myDir.listFiles()?.forEach { dir ->
    println(dir.name)
}


// Создаем директорию workspace/task4/temp.
// Внутри директории temp создаем несколько вложенных файлов и директорий. 
// Удаляем директорию workspace/task4 со всем содержимым

val tempDirectory = File("workspace/task4/temp")
tempDirectory.mkdirs()

val nestedFile1 = File(tempDirectory, "nestedFile1.txt")
val nestedFile2 = File(tempDirectory, "nestedFile2.txt")
val nestedDir1 = File(tempDirectory, "nestedDir1")
val nestedDir2 = File(tempDirectory, "nestedDir2")
nestedFile1.createNewFile()
nestedFile2.createNewFile()
nestedDir1.mkdirs()
nestedDir2.mkdirs()

tempDirectory.deleteRecursively()


// Создаем файл workspace/task5/config/config.txt
// Записываем в него список параметров (в формате ключ=значение), 
// а затем прочитываем файл и выводим только значения.

val configDirectory = File("workspace/task5/config")
configDirectory.mkdirs()

val configFile = File(configDirectory, "config.txt")
configFile.writeText("param1=value1\nparam2=value2\nparam3=value3")

val lines = configFile.readLines()
lines.forEach { line ->
    println(line.split("=")[1])
}


// Проходим по всем вложенным директориям workspace и выводим в консоль сначала пути директорий, 
// а потом пути файлов

val workspaceDirectory = File("workspace")
workspaceDirectory.walk().forEach { file ->
    println(file.absolutePath)
}


// Создаем директорию workspace/task9/docs.
// Проверяем, есть ли файл с именем readme.md. Если файла нет, 
// создаем его и записываем текст "This is a README file."

val docsDirectory = File("workspace/task9/docs")
docsDirectory.mkdirs()

val readmeFile = File(docsDirectory, "readme.md")
if (!readmeFile.exists()) {
    readmeFile.createNewFile()
    readmeFile.writeText("This is a README file.")
}


// Создаем файлы
// workspace/task10/data/1/4/prod/data14.mysql
// workspace/task10/data/2/3/prod/data23.mysql
// workspace/task10/data/5/2/prod/data52.mysql
// Создаем директорию workspace/task10/backup 
// и копируем туда файлы из workspace/task10/data сохраняя структуру директорий. 
// Для копирования используем метод copyTo

val data14Directory = File("workspace/task10/data/1/4/prod")
val data23Directory = File("workspace/task10/data/2/3/prod")
val data52Directory = File("workspace/task10/data/5/2/prod")
data14Directory.mkdirs()
data23Directory.mkdirs()
data52Directory.mkdirs()

val data14File = File(data14Directory, "data14.mysql")
val data23File = File(data23Directory, "data23.mysql")
val data52File = File(data52Directory, "data52.mysql")
data14File.createNewFile()
data23File.createNewFile()
data52File.createNewFile()

val backupDirectory = File("workspace/task10/backup")
backupDirectory.mkdirs()

val dataDirectory = File("workspace/task10/data")
dataDirectory.copyRecursively(backupDirectory)


}