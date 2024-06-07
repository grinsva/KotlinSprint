package lesson_2

const val MIN_IN_HOUR = 60
const val HOUR_IN_DAY = 24

fun main() {

    val departHour = 9
    val departMinite = 39
    val rideTimeMinTotal = 1457

    //Сколько минут от 00:00 начинается отправление
    val departTotalMin = departMinite + departHour * MIN_IN_HOUR

    //Сколько минут от 00:00 прибытие
    val arriveTotalMinInt = departTotalMin + rideTimeMinTotal

    val arriveHourInt = when {
        (arriveTotalMinInt / MIN_IN_HOUR < HOUR_IN_DAY) -> arriveTotalMinInt / MIN_IN_HOUR
        else -> (arriveTotalMinInt / MIN_IN_HOUR - HOUR_IN_DAY)
    }

    val arriveMinInt = arriveTotalMinInt % MIN_IN_HOUR

    val arriveHourStr = String.format("%02d", arriveHourInt)
    val arriveMinStr = String.format("%02d", arriveMinInt)

    println("Поезд прибывает в $arriveHourStr:$arriveMinStr")

}