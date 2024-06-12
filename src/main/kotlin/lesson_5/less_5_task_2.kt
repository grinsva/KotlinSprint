package lesson_5

const val ACCESS_AGE = 18
const val PRESENT_YEAR = 2024

fun main() {

    println("Введите ваш год рождения:")
    val userBirthYear = readln().toInt()

    val userAge = PRESENT_YEAR - userBirthYear

    if ( userAge >= ACCESS_AGE ) println("Показывать экран со скрытым контентом")
    else println("Вернуться на главный экран")
}