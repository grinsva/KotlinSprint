package lesson_4

const val CREW_COUNT_MIN = 55
const val CREW_COUNT_GOOD = 70
const val PROVISION_MIN = 50

fun main() {
    println(
        "Имются ли повреждения корабля? \n" +
                "Введите 'true', если Да, иное если Нет"
    )
    val hasDamage: Boolean = readln().toBoolean()
    println("Вы ввели: $hasDamage \n")

    println("Введите количество экипажа:")
    val crewCount = readln().toInt()
    println("Вы ввели: $crewCount\n")

    println("Введите ящиков с провизией:")
    val boxOfProvisions = readln().toInt()
    println("Вы ввели: $boxOfProvisions\n")

    println("Благоприятность метеоусловий? \n" +
            "Введите 'true', если Да, иное если Нет"
    )
    val weatherConditionsGood = readln().toBoolean()
    println("Вы ввели: $weatherConditionsGood\n")

    val missionIsPossible = (!hasDamage
            && (crewCount in CREW_COUNT_MIN..CREW_COUNT_GOOD)
            && boxOfProvisions > PROVISION_MIN
            )  or
            (crewCount == CREW_COUNT_GOOD
            && boxOfProvisions >= PROVISION_MIN
            && weatherConditionsGood
            )

    println("Плавание возможно: $missionIsPossible")
}