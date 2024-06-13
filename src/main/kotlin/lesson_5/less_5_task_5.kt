package lesson_5

const val RANDOM_MAX = 5
const val RANDOM_MIN = 0

fun main() {

    val numberList = setOf(
        (RANDOM_MIN..RANDOM_MAX).random(),
        (RANDOM_MIN..RANDOM_MAX).random(),
        (RANDOM_MIN..RANDOM_MAX).random()
    )

    val numberListSize = numberList.count()
    println("Загадано $numberListSize числа")

    println("Введите первое число в интервале чисел от $RANDOM_MIN до $RANDOM_MAX:")
    val inputNumList = mutableListOf(readln().toInt())

    println("Введите второе число в интервале чисел от $RANDOM_MIN до $RANDOM_MAX:")
    inputNumList.add(readln().toInt())

    println("Введите третье число в интервале чисел от $RANDOM_MIN до $RANDOM_MAX:")
    inputNumList.add(readln().toInt())

    val intersectList = inputNumList.intersect(numberList)

    when (intersectList.size) {
        3 -> println("Вы угадали все числа. Вы выиграли джекпот!")
        2 -> println("Вы угадали два числа. Вы получаете крупный приз!")
        1 -> println("Вы угадали одно число. Вы получаете утешительный приз!")
        else -> println("Вы не угадали ни одного числа")
    }

    println("Выигрышные числа: $numberList")
}