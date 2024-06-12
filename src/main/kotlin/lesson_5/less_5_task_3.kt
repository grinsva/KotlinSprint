package lesson_5

const val RANDOM_MAX = 5
const val RANDOM_MIN = 0
fun main() {

    val numberOne = (RANDOM_MIN..RANDOM_MAX).random()
    val numberTwo = (RANDOM_MIN..RANDOM_MAX).random()

    println("Угадайте и введите первое число в интервале чисел от $RANDOM_MIN до $RANDOM_MAX:")
    val inputNumOne = readln().toInt()

    val resultOne: Boolean =
        if (numberOne == inputNumOne) {
            println("Верно!")
            true
        } else {
            println("Жаль, но правильное число $numberOne")
            false
        }

    println("Угадайте и введите второе число в интервале чисел от $RANDOM_MIN до $RANDOM_MAX:")
    val inputNumTwo = readln().toInt()

    val resultTwo =
        if (numberTwo == inputNumTwo) {
            println("Верно!")
            true
        } else {
            println("Жаль, но правильное число $numberTwo")
            false
        }

    if (resultOne && resultTwo) println("Поздравляем! Вы выиграли главный приз!")
    else if (resultOne || resultTwo) println("Вы выиграли утешительный приз!")
    else println("Пускай сегодня не повезло. Но игра продолжается!")
}