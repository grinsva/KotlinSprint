package lesson_4

const val AVERAGE_MASS_MIN = 35
const val AVERAGE_MASS_MAX = 100
const val AVERAGE_VOLUME_MAX = 100

fun main() {

    val massСargo = 42
    val volumeСargo = 120

    val isAverage =
        (massСargo != AVERAGE_MASS_MIN && massСargo in AVERAGE_MASS_MIN..AVERAGE_MASS_MAX)
                && (volumeСargo < AVERAGE_VOLUME_MAX)

    println("Груз с весом $massСargo кг и объемом $volumeСargo л соответствует категории 'Average': $isAverage")

    val massСargo1 = 20
    val volumeСargo1 = 80

    println(
        "Груз с весом $massСargo1 кг и объемом $volumeСargo1 л соответствует категории 'Average': " +
                "${
                    massСargo1 > AVERAGE_MASS_MIN && massСargo1 <= AVERAGE_MASS_MAX
                            && volumeСargo1 < AVERAGE_VOLUME_MAX
                }"
    )

    val massСargo2 = 50
    val volumeСargo2 = 100

    println(
        "Груз с весом $massСargo2 кг и объемом $volumeСargo2 л соответствует категории 'Average': " +
                "${
                    massСargo2 > AVERAGE_MASS_MIN && massСargo2 <= AVERAGE_MASS_MAX
                            && volumeСargo2 < AVERAGE_VOLUME_MAX
                }"
    )
}