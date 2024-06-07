package lesson_3

fun main() {

    var stepStart = "E2"
    var stepEnd = "E4"
    var stepNumber = 1

    var stepInfo = "[$stepStart-$stepEnd; ${stepNumber}]"

    println(stepInfo)

    stepStart = "D2"
    stepEnd = "D3"
    stepNumber = 2

    stepInfo = "[$stepStart-$stepEnd; ${stepNumber}]"

    println(stepInfo)


}