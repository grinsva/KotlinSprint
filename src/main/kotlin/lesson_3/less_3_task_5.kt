package lesson_3

fun main() {

    val stepInfo = "D2-D4; 0"

    val stepStart = stepInfo.take(2)
    val stepEnd = stepInfo.take(5).takeLast(2) //
    val stepNumber = stepInfo.drop(7).toInt()

    println(
        """
Откуда: $stepStart
Куда: $stepEnd
Номер хода: $stepNumber"""
    )


}