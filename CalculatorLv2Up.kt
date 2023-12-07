package com.example.calculatorhw

fun main() {
    var num1: Double=0.0
    println("수를 입력하세요.")
    while (num1 == 0.0) {
        try {

            num1 = readLine()!!.toDouble()
        } catch (e: java.lang.NumberFormatException) {
            println("숫자를 입력해 주셔야 해요.")
        }
    }

    while(true) {
        try {
            println("사칙연산 +,-,*,/,% 중 선택해 주세요")
            var chec = readLine()!!.toString()

            var num2 = readLine()!!.toDouble()

            var Calculator2 = Calculators(chec, num1, num2)
            num1= Calculator2.calculate(chec)


        } catch(e:java.lang.NumberFormatException) {
            println("정상적인 값을 입력해 주셔야 해요.")
        }
    }

}

class Calculators(chec: String, num1: Double, num2: Double) {
    var num1: Double = num1
    var num2: Double = num2


    fun calculate(chec: String):Double {
        when (chec) {
            "+" -> return plu()
            "-" -> return min()
            "*" -> return mul()
            "/" -> return div()
            "%" -> return lef()
            else -> {
                error()
                return num1

            }
        }
    }

    fun plu():Double {
        num1 = num1 + num2
        println("두 수의 합 $num1")
        return num1

    }

    fun min():Double {
        num1 = num1 - num2
        println("두 수의 차 $num1")
        return num1
    }

    fun mul():Double {
        num1 = num1 * num2
        println("두 수의 곱 $num1")
        return num1
    }

    fun div():Double {
        num1 = num1 / num2
        println("두 수의 나눔 $num1")
        return num1
    }

    fun lef():Double{
        num1 = num1 % num2
        println("나머지 $num1")
        return num1
    }

    fun error() {
        println("잘못된 입력입니다.")
        println("첫번째 수= ${num1} ")
    }

}

