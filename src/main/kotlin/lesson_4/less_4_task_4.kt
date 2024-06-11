package lesson_4

const val DELITEL_2_PROVERKI_4ETNOSTI = 2
const val ZERO_OSTATOK_PROVERKI_4ETNOSTI = 0

fun main() {

    val dayOfPractice = 5

    val armPractice:   Boolean = ( dayOfPractice % DELITEL_2_PROVERKI_4ETNOSTI > ZERO_OSTATOK_PROVERKI_4ETNOSTI )
    val bellyPractice: Boolean = ( dayOfPractice % DELITEL_2_PROVERKI_4ETNOSTI > ZERO_OSTATOK_PROVERKI_4ETNOSTI )

    val legPractice:   Boolean = ( dayOfPractice % DELITEL_2_PROVERKI_4ETNOSTI == ZERO_OSTATOK_PROVERKI_4ETNOSTI )
    val backPractice:  Boolean = ( dayOfPractice % DELITEL_2_PROVERKI_4ETNOSTI == ZERO_OSTATOK_PROVERKI_4ETNOSTI )

    println("""
        Сегодня $dayOfPractice день тренировок.
        Упражнения для рук: $armPractice  
        Упражнения для ног: $legPractice 
        Упражнения для спины: $backPractice
        Упражнения для пресса: $bellyPractice
    """.trimIndent())
}
