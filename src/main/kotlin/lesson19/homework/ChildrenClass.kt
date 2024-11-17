package com.daniilpuris.lesson19.homework

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    // потому что в классе родителе он публичный
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) //{

    /*override fun verifyPublicField(value: String): Boolean {
        return true
    }

    fun setProtectedField1 (value: String){
        ProtectedField = value
    }

    // объясни, почему в main() доступна функция getAll() хотя её здесь нет
    // потому что она публичная

    // проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint()
    // потому что метод приватный и класс наследник ее не видит
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }
}
*/