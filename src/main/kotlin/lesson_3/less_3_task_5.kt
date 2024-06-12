package lesson_3

fun main() {

    val stepInfo = "D2-D4; 10"

    val stepInfoList = stepInfo.split("-","; ")

    println("""
        Откуда: ${stepInfoList[0]}
        Куда: ${stepInfoList[1]}
        Номер хода: ${stepInfoList[2]}
        """.trimIndent()
    )
}