package lesson_2

const val minInHour = 60

fun main() {

    val departHourStr: String = "09"
    val departMinStr = "39"
    val rideTimeMinTotal = 1457

    val departHourInt = departHourStr.toInt()
    val departMinInt = departMinStr.toInt()
    val departTotalMin = departMinInt + departHourInt * minInHour //Сколько минут от 00:00 (обычно в секундх считается)

    val arriveTotalMinInt = departTotalMin + rideTimeMinTotal

    val arriveHourInt  = when {
        (arriveTotalMinInt / minInHour < 24) -> arriveTotalMinInt / minInHour
        else -> (arriveTotalMinInt / minInHour - 24)
    }

    val arriveMinInt  = arriveTotalMinInt % minInHour

    val arriveHourStr = String.format("%02d",arriveHourInt)
    val arriveMinStr = String.format("%02d",arriveMinInt)

    println("Поезд прибывает в $arriveHourStr:$arriveMinStr")

}