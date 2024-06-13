package lesson_4

const val NUMBER_TWO = 2
const val ZERO = 0

fun main() {

    val dayOfPractice = 5
    val balanceDivision = dayOfPractice % NUMBER_TWO

    val armPractice: Boolean = balanceDivision > ZERO
    val bellyPractice: Boolean = balanceDivision > ZERO

    val legPractice: Boolean = balanceDivision == ZERO
    val backPractice: Boolean = balanceDivision == ZERO

    println(
        """
        Сегодня $dayOfPractice день тренировок.
        Упражнения для рук: $armPractice  
        Упражнения для ног: $legPractice 
        Упражнения для спины: $backPractice
        Упражнения для пресса: $bellyPractice
    """.trimIndent()
    )
}
