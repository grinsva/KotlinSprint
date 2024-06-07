package lesson_3

const val GRITING_MORNING = "Доброе утро!"
const val GRITING_EVENING = "Доброго вечера!"
const val GRITING_DAY = "Доброго дня!"
const val GRITING_NIGHT = "Доброй ночи!"
fun main() {

    val userName = "Василий"
    val hourOfDay = 7

    val partOfDayGritting: String = when(hourOfDay) {
        in 6..10 -> GRITING_MORNING
        in 11..17 -> GRITING_DAY
        in 18..21 -> GRITING_EVENING
        else -> GRITING_NIGHT
    }

    println("$partOfDayGritting $userName.")
}