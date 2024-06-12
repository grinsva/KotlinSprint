package lesson_1


fun main() {
    /*
     – Запиши в новую переменную year год полета Юрия Гагарина в космос;
     – Объяви и проинициализируй переменные hour и minute – час и минуту взлета соответственно;
     – Выведи год, час и минуту взлета по одной переменной на каждую строку;
     – Затем измени значения переменных hour и minute, чтобы они теперь имели
       значение часа и минуты посадки;
     – Выведи время посадки в одной строке в формате [часы:минуты]. Пример: 10:55.

     Определи, где в программе переменные должны задаваться через val, а где через var.

           Данные для задачи:
           Год полета – 1961
           Взлет – 09:07
           Посадка – 10:55
     */

    val year: Int = 1961
    var hour: Int= 9
    var minute = 7

    println("Взлет космического корабля состоялся \n" +
            "в $year" + " году \n" +
            "в $hour" + " часов \n" +
            minute + " минут\n")

    hour = 10
    minute = 55

    println("Посадка состоялась:")
    print("в " + hour + ":" + minute + "\n")
}