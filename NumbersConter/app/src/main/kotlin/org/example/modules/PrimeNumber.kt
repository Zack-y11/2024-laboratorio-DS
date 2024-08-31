package org.example
import org.example.Number

//Clase para los numeros primos

data class PrimeNumber(override val valueNumber: Int): Number{
    override fun isPrime():Boolean{
        if(valueNumber <= 1) return false
        for (i in 2 until valueNumber){
            if(valueNumber % i == 0 && i != 1) return false
        }
        return true
    }

    override fun isEven():Boolean{
        return valueNumber % 2 == 0
    }

    override fun dividers (): List<Int>{
        return (1..valueNumber).filter { valueNumber % it == 0 }
    }
}