package lesson_2


fun main() {

    val emplCount: UShort = 50u
    val stagCount: UShort = 30u

    val totalCount = emplCount + stagCount

    val salaryEmpl: UInt = 30000u
    val salaryStager: UInt = 20000u

    val salaryEmplTotal = salaryEmpl * emplCount
    val salaryStagerTotal = salaryStager * stagCount

    val salaryTotal = salaryEmplTotal + salaryStagerTotal

    val srSalary = salaryTotal / totalCount

    println("Расходы на выплату зарплаты постоянных сотрудников: $salaryEmplTotal рублей\n" +
            "Общие расходы по ЗП после прихода стажеров: $salaryTotal рублей\n" +
            "Среднюю ЗП одного сотрудника после устройства стажеров: $srSalary руб./чел.")

}