package lesson_3

const val GRITING_MORNING = "Доброе утро!"
const val GRITING_EVENING = "Доброго вечера!"
const val GRITING_DAY = "Доброго дня!"
const val GRITING_NIGHT = "Доброй ночи!"

const val MORNING_START_HOUR = 6
const val DAY_START_HOUR = 11
const val EVENING_START_HOUR = 18
const val NIGHT_START_HOUR = 22

fun main() {

    val userName = "Василий"
    val hourOfDay = 23

    val partOfDayGritting: String = when (hourOfDay) {
        in MORNING_START_HOUR..<DAY_START_HOUR -> GRITING_MORNING
        in DAY_START_HOUR..<EVENING_START_HOUR -> GRITING_DAY
        in EVENING_START_HOUR..<NIGHT_START_HOUR -> GRITING_EVENING
        else -> GRITING_NIGHT
    }

    println("$partOfDayGritting $userName.")
}