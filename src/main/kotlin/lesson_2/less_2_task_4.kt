package lesson_2

const val PROCENT_100 = 100

fun main() {

    val kristRuda = 27
    val ferrRuda = 11

    val baffProcent = 20

    val kristRudaBonus = kristRuda * baffProcent / PROCENT_100
    val ferrRudaBonus = ferrRuda * baffProcent / PROCENT_100

    println(
        "Ваш заработанный бонус: \n" +
                "кристаллическая руда - $kristRudaBonus \n" +
                "железная руда -  $ferrRudaBonus\n"
    )

}