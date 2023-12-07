package com.example.calculatorhw

fun main() {
    println("첫번째 값을 입력해주세요")
    var num1 = readLine()!!.toDouble()
    println("두번째 값을 입력해주세요")
    var num2 = readLine()!!.toDouble()
    println("사칙연산 +,-,*,/ 중 선택해주세요")
    var chec = readLine()!!

    var result: Double = 0.0
    if (chec == "+") {
        result = num1 + num2
        println("두 수의 합 ${result}")
    }
    if (chec == "-") {
        result = num1 - num2
        println("두 수의 차 ${result}")
    }
    if (chec == "*") {
        result = num1 * num2
        println("두 수의 곱 ${result}")
    }
    if (chec == "/") {
        result = num1 / num2
        println("두 수의 나눔 ${result}")
    }
}