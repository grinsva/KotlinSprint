package lesson_2

fun main() {

    val ballStdent1: UShort = 3u
    val ballStdent2: UShort = 4u
    val ballStdent3: UShort = 3u
    val ballStdent4: UShort = 5u

    val sredniBall = (ballStdent1 + ballStdent2 + ballStdent3 + ballStdent4).toFloat() / 4

    val sredniBallStr = String.format("%.2f", sredniBall)

    println(sredniBallStr)


}