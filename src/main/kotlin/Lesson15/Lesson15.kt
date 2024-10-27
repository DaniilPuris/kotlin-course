package com.daniilpuris.Lesson15

fun main(){

}

/* 1. Событие: Вечеринка Создание класса Party, который описывает вечеринку.
      У него есть свойства location (String) и attendees (Int).
      Добавление метода details(), который выводит информацию
      о месте проведения и количестве гостей.
*/
class Party(
    val location: String,
    var attendees: Int
){
    fun locationAndAttendees(){
        println("место проведения — $location количество гостей — $attendees")
    }
}


/* 2. Аспект реальности: Эмоция Создание класса Emotion,
      который представляет эмоцию. У него должно быть свойство type (String)
      и intensity (Int). Добавьте метод express(),
      который выводит описание эмоции в зависимости от её типа и интенсивности.
*/
class Emotion(
    val type: String,
    var intensity: Int
){
    fun express(){
        val description = when {
            intensity <= 3 -> "слабая $type"
            intensity in 4..7 -> "средняя $type"
            intensity > 7 -> "сильная $type"
            else -> "$type неизвестной интенсивности"
        }
        println("Эмоция: $description")
    }
}
/* 3. Природное явление: Луна Создание объекта Moon,
      который будет представлять Луну. Добавьте свойства isVisible (Boolean),
      чтобы отображать, видна ли Луна в данный момент, и phase (String),
      чтобы отображать текущую фазу Луны (например, "Full Moon", "New Moon").
      Добавление метода showPhase(), который выводит текущую фазу Луны.
*/
object Moon {
    var isVisible: Boolean = true
    var phase: String = "Full Moon"

    fun showPhase() {
        if (isVisible) {
            println("$phase")
        } else {
            println("Is not visible")
        }
    }
}
/* 4. Покупка: Продукт Создание дата класса для продукта,
      который будет представлять продукт в магазине.
      У него должны быть свойства “название”, “цена”, “количество”.
*/
data class Product(
    val name: String,
    val price: Double,
    val quantity: Int
)
/* 5. Мероприятие: Концерт Создайте класс, который будет представлять концерт.
      У него должны быть свойства “группа”, “место проведения”, “стоимость”,
      “вместимость зала”. Также приватное поле “проданные билеты”.
      Добавьте метод, который выводит информацию о концерте и метод “купить билет”,
      который увеличивает количество проданных билетов на один.
*/
class Concert(
    val band: String,
    val venue: String,
    val ticketPrice: Double,
    val capacity: Int
) {
    private var soldTickets: Int = 0

    fun displayConcertInfo() {
        println("$band")
        println("$venue")
        println("$ticketPrice")
        println("$capacity")
        println("$soldTickets")
        println("${capacity - soldTickets}")
    }

    fun buyTicket() {
        if (soldTickets < capacity) {
            soldTickets++
        }
    }
}
