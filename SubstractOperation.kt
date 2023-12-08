package com.example.calculatorhw

class SubstractOperation: Calculator() {
    override fun realcalculate(num1: Double, num2: Double): Double {
        return num1 - num2
    }
}