package lesson_1

const val secInHour = 3600
const val secInMin = 60
const val minInHour = 60



fun main() {
/*
Объяви переменную с количеством секунд, которые Гагарин провел в космосе.

- Переведи в коде количество секунд в целые минуты и целые часы,
сохраняя остаток секунд и минут в новые переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды],
например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами.
 */

    val seconds: Int = 8487

    val hour: Int = seconds / secInHour
    val minutes: Int = seconds / secInMin - hour * minInHour
    val sec: Int = seconds - hour * secInHour - minutes * secInMin

    val hourString = String.format("%02d", hour)

    val minutesString = String.format("%02d", minutes)

    val secString = String.format("%02d", sec)

    println(hourString + ":" + minutesString + ":" + secString)

    }




