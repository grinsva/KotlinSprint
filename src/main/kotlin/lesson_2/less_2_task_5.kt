package lesson_2

import kotlin.math.pow

fun main() {

    val amountBase: Double = 70000.0
    val procent: Double = 16.7
    val period = 20

    val amountCalculated = amountBase * (1 + procent / 100).pow(period)

    val amountCalculatedStr = String.format("%.3f", amountCalculated)

    println(
        "Размер вклада через $period лет\n" +
                "составит:    $amountCalculatedStr рублей \n"
    )

}