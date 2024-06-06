package lesson_2


fun main() {
    /*
  В компании работало 50 человек с зарплатой по 30000 рублей.
Затем в компанию устроилось 30 стажеров, которым назначили зарплату в 20000 рублей каждому.
 Пишем часть гипотетического софта для бухгалтерии, который будет считать:

– Расходы на выплату зарплаты постоянных сотрудников;
– Общие расходы по ЗП после прихода стажеров;
– Среднюю ЗП одного сотрудника после устройства стажеров.

  Каждый пункт посчитать и сохранить в переменную с соответствующим названием.
Все значения необходимо вывести в виде целых чисел.
 */

    var emplCount: UShort = 50u
    var stagCount: UShort = 30u

    var totalCount = emplCount + stagCount

    val salaryEmpl: UInt = 30000u
    val salaryStager: UInt = 20000u

    var salaryEmplTotal = salaryEmpl * emplCount
    var salaryStagerTotal = salaryStager * stagCount

    var salaryTotal = salaryEmplTotal + salaryStagerTotal

    var srSalary = salaryTotal / totalCount

    println("Расходы на выплату зарплаты постоянных сотрудников: $salaryEmplTotal рублей\n" +
            "Общие расходы по ЗП после прихода стажеров: $salaryTotal рублей\n" +
            "Среднюю ЗП одного сотрудника после устройства стажеров: $srSalary руб./чел.")

}