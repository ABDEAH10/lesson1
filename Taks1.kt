@file:Suppress("UNUSED_PARAMETER")

package lesson1.task1

import kotlin.math.*

// Урок 1: простые функции
// Максимальное количество баллов = 5
// Рекомендуемое количество баллов = 4

fun main() {
    /**
     * Пример
     *
     * Вычисление квадрата целого числа
     */
    val a = 2
    val b = 20.5
    val c = 4

    val sqaureInteger = a * a
    println("Square integer: $sqaureInteger")


    /**
     * Пример
     *
     * Вычисление квадрата вещественного числа
     */

    val squareDouble = b * b
    println("Square double: $squareDouble")

    /**
     * Пример
     *
     * Вычисление дискриминанта квадратного уравнения
     **/

    val discriminant = (squareDouble) - 4 * a * c
    println("Discriminant = $discriminant")

    /**
     * Пример
     *
     * Поиск одного из корней квадратного уравнения
     */

    val quadraticEquationRoot = (-b + sqrt(discriminant) / (2 * a))
    println("Quadratic equation root: $quadraticEquationRoot")
    /**
     * Пример
     *
     * Поиск произведения корней квадратного уравнения
     **/

    val sd = sqrt(discriminant)
    val x1 = (-b + sd) / (2 * a)
    val x2 = (-b - sd) / (2 * a)
    val result = x1 * x2

    println("Result: $result") // Результат
    /**
     * Пример главной функции
     *
    val x1x2 = quadraticRootProduct(1.0, 13.0, 42.0)
    println("Root product: $x1x2") **/
}