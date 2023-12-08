package com.example.calculatorhw

fun main() {
    var num1: Double=0.0
    println("수를 입력하세요.")
    while (num1 == 0.0) {
        try {

            num1 = readLine()!!.toDouble()
        } catch (e: NumberFormatException) {
            println("숫자를 입력해 주셔야 해요.")
        }
    }

    while(true) {
        try {
            println("사칙연산 +,-,*,/ 중 선택해 주세요")
            var chec = readLine()!!.toString()
            if (chec !in setOf("+","-","*","/")){
                println("알맞은 연산자를 입력해주세요")
                continue
            }
            println("수를 입력하세요.")
            var num2 = readLine()!!.toDouble()

            var calculate = when (chec) {
                "+" -> AddOperation()
                "-" -> SubstractOperation()
                "*" -> MultiplyOperation()
                "/" -> DivideOperation()
                else -> {
                    println("잘못된 입력입니다.")
                    continue
                }
            }
            print("${num1} ${chec} ${num2} = ")
            num1 = calculate.realcalculate(num1, num2)
            println("${num1}")

        }
        catch(e: NumberFormatException){
            println("정상적인 값을 입력해 주셔야 해요.")
        }
    }

}

open class Calculator {
 open fun realcalculate(num1:Double, num2:Double):Double{
     return 0.0
 }
}