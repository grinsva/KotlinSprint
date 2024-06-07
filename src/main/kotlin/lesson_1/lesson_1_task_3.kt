package lesson_1


fun main() {

    val year: String = "1961"
    var hour: String= "09"
    var minute = "07"

    println("Взлет космического корабля состоялся \n" +
            "в $year" + " году \n" +
            "в $hour" + " часов \n" +
            minute + " минут\n")

    hour = "10"
    minute = "55"

    println("Посадка состоялась:")
    print("в " + hour + ":" + minute + "\n")
}