package lesson_1

fun main() {
/*
Объяви переменную с количеством секунд, которые Гагарин провел в космосе.

- Переведи в коде количество секунд в целые минуты и целые часы,
сохраняя остаток секунд и минут в новые переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды],
например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами.
 */

    val seconds: UShort = 8488u

    val hour: UByte = (seconds/3600u).toUByte()
    val minutes: UInt = seconds/60u - hour*60u
    val sec: UInt = seconds - hour * 3600u - minutes * 60u

    val hourString: String = when {
        (hour < 10u) ->  "0$hour"
        else ->  "$hour"}

    val minutesString: String = when {
        (minutes < 10u) ->  "0$minutes"
        else ->  "$minutes"}

    val secString: String = when {
        (sec < 10u) ->  "0$sec"
        else ->  "$sec"}

    println(hourString + ":" + minutesString + ":" + secString)

    }




