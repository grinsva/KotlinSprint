package lesson_4

const val TABLE_COUNT = 13

fun main() {

    val reservedTableToday = 13
    val reservedTableTomorrow = 9

    val freeTableToday = reservedTableToday < TABLE_COUNT
    val freeTableTomorrow = reservedTableTomorrow < TABLE_COUNT



        println("Доступность столиков на сегодня: $freeTableToday\n" +
           "Доступность столиков на завтра: $freeTableTomorrow")
}
