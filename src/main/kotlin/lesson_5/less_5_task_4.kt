package lesson_5

const val LOGIN_Z = "Zaphod"
const val PASSWORD_Z = "PanGalactic"

fun main() {

    println("Введите ваш логин:")
    val userLogin = readln().toString()

    val userPassword: String

    if (userLogin != LOGIN_Z) {
        println("Пожалуйста зарегистрируйтесь в системе!")
        return
    } else {
        println("Введите ваш пароль:")
        userPassword = readln().toString()
    }
    if (userPassword != PASSWORD_Z) println("Пароль недействителен!")
    else println(
        "Ваши данные проверены, и о, чудо, они верны... \n" +
                "Пользователь '$LOGIN_Z', \n" +
                "вам разрешено входить на борт корабля 'Heart of Gold'"
    )
}