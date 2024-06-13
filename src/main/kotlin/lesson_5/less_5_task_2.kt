package lesson_5

const val ACCESS_AGE = 18

fun main() {

    val yearPresent = 2024

    println("Введите ваш год рождения:")
    val userBirthYear = readln().toInt()

    val userAge = yearPresent - userBirthYear

    if (userAge >= ACCESS_AGE) {
        println("Показывать экран со скрытым контентом")
    } else {
        println("Вернуться на главный экран")
    }
}