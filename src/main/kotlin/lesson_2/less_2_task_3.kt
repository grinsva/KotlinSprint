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
    val arriveTotalMin = departTotalMin + rideTimeMinTotal

    val arriveHour = when {
        (arriveTotalMin / MIN_IN_HOUR < HOUR_IN_DAY) -> arriveTotalMin / MIN_IN_HOUR
        else -> (arriveTotalMin / MIN_IN_HOUR - HOUR_IN_DAY)
    }

    val arriveMin = arriveTotalMin % MIN_IN_HOUR


    println("Поезд прибывает в " + ("%02d:%02d".format(arriveHour, arriveMin)))


}