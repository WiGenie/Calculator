//package com.example.calculatorhw
//
//fun main() {
//
//    while(true) {
//        try {
//            println("첫번째 값을 입력해주세요")
//            var num1 = readLine()!!.toDouble()
//            println("두번째 값을 입력해주세요")
//            var num2 = readLine()!!.toDouble()
//            println("사칙연산 +,-,*,/,% 중 선택해주세요")
//            var chec = readLine()!!.toString()
//            var Calculator2 = Calculator(num1, num2, chec)
//            Calculator2.calculate(chec)
//            break
//        } catch(e:java.lang.NumberFormatException) {
//            println("숫자를 입력하세요")
//        }
//    }
//
//}
//
//class Calculator(num1: Double, num2: Double, chec: String) {
//    var num1: Double = num1
//    var num2: Double = num2
//    var result: Double = 0.0
//
//
//    fun calculate(chec: String) {
//        when (chec) {
//            "+" -> plu()
//            "-" -> min()
//            "*" -> mul()
//            "/" -> div()
//            "%" -> lef()
//            else -> error()
//        }
//    }
//
//    fun plu() {
//        result = num1 + num2
//        println("두 수의 합 $result")
//    }
//
//    fun min() {
//        result = num1 - num2
//        println("두 수의 차 $result")
//    }
//
//    fun mul() {
//        result = num1 * num2
//        println("두 수의 곱 $result")
//    }
//
//    fun div() {
//        result = num1 / num2
//        println("두 수의 나눔 $result")
//    }
//
//    fun error() {
//        println("잘못된 입력입니다.")
//    }
//    fun lef(){
//        result = num1 % num2
//        println("나머지는 ${result} 입니다.")
//    }
//}
//
