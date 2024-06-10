package lesson_4

const val HUMIDITY_GOOD = 20
const val SEASON_NOT_GOOD = "зима"

fun main() {

    val weatherIsSunny= true
    val tentIsOpen = true
    val humidity = 20
    val season = "зима"

    val isConditionsGood = weatherIsSunny
                        && tentIsOpen
                        && ( humidity == HUMIDITY_GOOD )
                        && ( season != SEASON_NOT_GOOD )

            println("Благоприятные ли условия сейчас для роста бобовых? $isConditionsGood")

}