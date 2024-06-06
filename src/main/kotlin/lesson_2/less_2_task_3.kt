package lesson_2

const val minInHour = 60

fun main() {

    /*
    Задача 3 к Уроку 2
    Сайт с расписанием поездов получает данные с сервера.
    Сервер посылает время выезда и время в пути, а время
    прибытия вычисляется из них. Сервер прислал данные,
    что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.
     */

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