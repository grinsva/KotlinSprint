package lesson_3

const val USER_NAME_ID_20 = "Татьяна Сергеевна"
const val USER_SURNAME_ID_20 = "Андреева"
const val USER_NAME_ID_22 = "Татьяна Сергеевна"
const val USER_SURNAME_ID_22 = "Сидорова"

fun main() {

    val userAge = 22

    val userName = when (userAge) {
        20 -> USER_NAME_ID_20
        22 -> USER_NAME_ID_22
        else -> "нет данных об имени"
    }
    val userSurName = when (userAge) {
        20 -> USER_SURNAME_ID_20
        22 -> USER_SURNAME_ID_22
        else -> "нет данных о фамилии"
    }

    println("Персональные данные: \n" +
            "ФИО: $userSurName $userName\n" +
            "Возраст: $userAge"

    )







}