@file:Suppress("UNUSED_PARAMETER")

package lesson1.task1

import javax.print.attribute.IntegerSyntax
import kotlin.math.pow

fun main() {

    // taks of lesson => 1
    println("**Calculate time in seconds.**")
    print("Put hours: ")
    val hours = Integer.valueOf(readLine())
    print("Put minutes: ")
    val minutes = Integer.valueOf(readLine())
    print("Put seconds: ")
    val seconds = Integer.valueOf(readLine())

    val calcHours = hours * 3600
    val calcMinutes = (minutes * 3600) / 60
    val calcSecond = calcHours + calcMinutes + seconds

    println("Time in seconds:  $calcSecond")

    /**
     * Тривиальная (1 балл)
     *
     * Пользователь задает длину отрезка в саженях, аршинах и вершках (например, 8 саженей 2 аршина 11 вершков).
     * Определить длину того же отрезка в метрах (в данном случае 18.98).
     * 1 сажень = 3 аршина = 48 вершков, 1 вершок = 4.445 см.
     **/
    println("**Determine the length of the segment in meters.**")

    print("Put arshins: ")
    val arshins = Integer.valueOf(readLine())
    print("Put vershoks: ")
    val vershoks = Integer.valueOf(readLine())

    val calcSagens = 3 * arshins
    val calcArshins = 16 * vershoks
    val calcVershoka = 44.45 * vershoks

    println("sagens = $calcSagens")
    println("arshins = $calcArshins")
    println("vershoks = $calcVershoka m")

    /**
     * Тривиальная (1 балл)
     *
     * Пользователь задает угол в градусах, минутах и секундах (например, 36 градусов 14 минут 35 секунд).
     * Вывести значение того же угла в радианах (например, 0.63256).
     **/

    println("**Calculate the value of the angle in radians.**")

    print("Put degree: ")
    val deg = Integer.valueOf(readLine())

    print("Put minutes: ")
    val min = Integer.valueOf(readLine())

    print("Put seconds: ")
    val sec = Integer.valueOf(readLine())

    val pi = 3.14159

    val rad = (deg + (min / 60) + (sec / 360)) * pi / 180

    println("Angle in radian: $rad rad")

    /**
     * Тривиальная (1 балл)
     *
     * Найти длину отрезка, соединяющего точки на плоскости с координатами (x1, y1) и (x2, y2).
     * Например, расстояние между (3, 0) и (0, 4) равно 5
     **/
    println("**Find the length of the line segment connecting AB.**")

    print("Put x1 = ")
    val x1 = Integer.valueOf(readLine())
    print("Put x2 = ")
    val x2 = Integer.valueOf(readLine())

    print("Put y1 = ")
    val y1 = Integer.valueOf(readLine())
    print("Put y2 = ")
    val y2 = Integer.valueOf(readLine())

    val ab = (y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1)
    val Ab = ab.toDouble().pow(1 / 2.toDouble())
    println("Track Length of AB = $Ab ")

    /**
     * Простая (2 балла)
     *
     * Пользователь задает целое число, большее 100 (например, 3801).
     * Определить третью цифру справа в этом числе (в данном случае 8).
     **/
    //fun thirdDigit(number: Int): Int = TODO()

    println("**Determine the third digit from the right.**")
    print("Please write an integer greater than 100: ")
    val number = Integer.valueOf(readLine())
    val determine = number / 100 // Делим число на 100
    val thirdNumber = determine % 10 //с использованием модульного деления и получения оставшегося числа

    println("The third digit is: $thirdNumber") // Третье число


    /**
     * Простая (2 балла)
     *
     *
     * Поезд вышел со станции отправления в h1 часов m1 минут (например в 9:25) и
     * прибыл на станцию назначения в h2 часов m2 минут того же дня (например в 13:01).
     * Определите время поезда в пути в минутах (в данном случае 216).
     **/

    println("**Determine the train travel time in minutes**")

    print("Write the hours of departure: ") // От пользователя
    val h1 = Integer.valueOf(readLine())
    print("Write the minutes of departure: ") // От пользователя
    val min1 = Integer.valueOf(readLine()) // Преобразовать строку в целочисленное значение

    print("Write arrival hours: ")
    val h2 = Integer.valueOf(readLine()) // Преобразовать строку в целочисленное значени
    print("Write arrival minutes: ")
    val min2 = Integer.valueOf(readLine())

    val determineHours = h2 - h1
    val determineMinutes = min2 - min1

    if (determineMinutes < 0) {

        val hoursToMinutes = determineHours * 60
        val determineToMinute = determineMinutes * (-1)
        val sumOfMinutes1 = hoursToMinutes + determineToMinute

        println("Determine the train travel is: $determineHours h : $determineToMinute min")
        println("Travel in minutes: $sumOfMinutes1 min")
    } else {
        val hoursToMinutes = determineHours * 60
        val sumOfMinutes2 = hoursToMinutes + determineMinutes

        println("Determine the train travel is: $determineHours h : $determineMinutes min")
        println("Travel in minutes: $sumOfMinutes2 min")
    }
/**
 * Простая (2 балла)
 *
 * Человек положил в банк сумму в s рублей под p% годовых (проценты начисляются в конце года).
 * Сколько денег будет на счету через 3 года (с учётом сложных процентов)?
 * Например, 100 рублей под 10% годовых превратятся в 133.1 рубля
**/

    println("**Acount in three years**")

    print("Put The Percentage rate P: ")
    val P = Integer.valueOf(readLine()) // p
    print("Put the deposit amount DA: ")
    val A = Integer.valueOf(readLine()) // СУММА ВКЛАДА

    val receivedAmount = A * ((1 + P) * (1 + P) * (1 + P)) // КОЛИЧЕСТВО ПЕРИОДОВ ,3 years

    println("Money will be on the account in 3 years: $receivedAmount rubles")

/**
 * Простая (2 балла)
 *
 * Пользователь задает целое трехзначное число (например, 478).
 * Необходимо вывести число, полученное из заданного перестановкой цифр в обратном порядке (например, 874).
 *
**/

    println("**Reverting**")

    print("Put any number: ")
    var num = Integer.valueOf(readLine())
    var reversedNumber = 0

    while (num != 0) {
        val remainder = num % 10
        reversedNumber = reversedNumber * 10 + remainder
        num /= 10
    }

    println("Reversed Number: $reversedNumber")
}