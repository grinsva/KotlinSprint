package lesson_3

fun main() {

    val userAge = 21

    val userName = "Татьяна"
    val userFatherName = "Сергеевна"

    val userSurName = when {
        (userAge < 22) -> "Андреева"
        else -> "Сидорова"
    }

    println(
        "Персональные данные: \n" +
                "Фамилия: $userSurName \n" +
                "Имя: $userName \n" +
                "Отчество: $userFatherName \n" +
                "Возраст: $userAge"

    )


}