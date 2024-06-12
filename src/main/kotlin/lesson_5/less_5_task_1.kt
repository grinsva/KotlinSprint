package lesson_5

fun main() {

    val a = (0..100).random()
    val b = (0..100).random()
    val result = a + b

    println("Введите результат суммы числа $a и $b:")
    val inputNum = readln().toInt()

    if (result == inputNum) println("Добро пожаловать!")
    else println("Доступ запрещен!")
}