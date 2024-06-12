package lesson_3

fun main() {

    var userAge = 21

    val userName = "Татьяна"
    val userFatherName = "Сергеевна"

    var userSurName = when {
        (userAge < 22) -> "Андреева"
        else -> "Сидорова"
    }

    println(
        "Персональные данные: \n" +
                "Фамилия: $userSurName \n" +
                "Имя: $userName \n" +
                "Отчество: $userFatherName \n" +
                "Возраст: $userAge \n"

    )

    userAge = 22

    userSurName = when {
        (userAge < 22) -> "Андреева"
        else -> "Сидорова"
    }

    println(
        "Персональные данные: \n" +
                "Фамилия: $userSurName \n" +
                "Имя: $userName \n" +
                "Отчество: $userFatherName \n" +
                "Возраст: $userAge \n"

    )






}