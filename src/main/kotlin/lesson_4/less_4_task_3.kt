package lesson_4

const val HUMIDITY_GOOD = 20
const val SEASON_NOT_GOOD = "зима"
const val TENT_IS_OPEN = true
const val TENT_IS_CLOSED = false
const val WEATHER_SUNNY = true
const val WEATHER_CLOUDLY = false

fun main() {

    val weatherSunCondition = WEATHER_SUNNY
    val tentCondition = TENT_IS_OPEN
    val humidity = 20
    val season = "зима"

    val isConditionsGood = weatherSunCondition
                        && tentCondition
                        && ( humidity == HUMIDITY_GOOD )
                        && ( season != SEASON_NOT_GOOD )

            println("Благоприятные ли условия сейчас для роста бобовых? $isConditionsGood")

}