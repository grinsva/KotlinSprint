package lesson_2

fun main() {

    val kristRuda = 27
    val ferrRuda = 11

    val baffProcent = 20

    val kristRudaBonus = kristRuda * baffProcent / 100
    val ferrRudaBonus = ferrRuda * baffProcent / 100

    println(
        "Ваш заработанный бонус: \n" +
                "кристаллическая руда - $kristRudaBonus \n" +
                "железная руда -  $ferrRudaBonus\n"
    )


}