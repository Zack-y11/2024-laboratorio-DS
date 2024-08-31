package org.example

import org.example.PrimeNumber
import org.example.EvenNumber
import org.example.OddNumber

//Clasificacion y validacion para los numeros, de destina a cada a uno a una lista segun su tipo

class ValidateNumber() {
    fun numberClassification(input: Int) {
        if (input < 0) throw IllegalArgumentException("Number must be greater than 0")
        
        val numbers = (1..input).map { 
            when {
                it % 2 == 0 -> EvenNumber(it)
                PrimeNumber(it).isPrime() -> PrimeNumber(it)
                else -> OddNumber(it) 
            }
        }

        val countPrimes = numbers.count { it is PrimeNumber }
        val countEvens = numbers.count { it is EvenNumber }
        val countOdds = numbers.size - countEvens


        numbers.forEach { 
            println("Number ${it.valueNumber}, Divisors: ${it.dividers()}")
        }
        println("Prime numbers count: $countPrimes")
        println("Even numbers count: $countEvens")
        println("Odd numbers count: $countOdds")
    }
}
