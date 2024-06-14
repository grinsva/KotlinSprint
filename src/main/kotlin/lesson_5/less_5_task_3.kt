package lesson_5

const val RANDOM_MAX = 42
const val RANDOM_MIN = 0

fun main() {

    val numberOne = (RANDOM_MIN..RANDOM_MAX).random()
    val numberTwo = (RANDOM_MIN..RANDOM_MAX).random()

    println("Угадайте и введите первое число в интервале чисел от $RANDOM_MIN до $RANDOM_MAX:")
    val inputNumOne = readln().toInt()

    println("Угадайте и введите второе число в интервале чисел от $RANDOM_MIN до $RANDOM_MAX:")
    val inputNumTwo = readln().toInt()

    if ((inputNumOne == numberOne) && (inputNumTwo != numberTwo) ||
        (inputNumOne != numberOne) && (inputNumTwo == numberTwo) ||
        (inputNumTwo == numberOne) && (inputNumOne != numberTwo) ||
        (inputNumTwo != numberOne) && (inputNumOne == numberTwo)
    )
        println("Вы выиграли утешительный приз!")
    else
        if ((inputNumOne == numberOne) && (inputNumTwo == numberTwo) ||
            (inputNumTwo == numberOne) && (inputNumOne == numberTwo)
        )
            println("Поздравляем! Вы выиграли главный приз!")
        else
            println("Пускай сегодня не повезло. Но игра продолжается!")

    println("Выигрышные числа: $numberOne и $numberTwo")
}