package org.example
import org.example.Number

//clase para los numero pares 
data class EvenNumber(override val valueNumber: Int): Number{
    override fun isPrime(): Boolean = false
    override fun isEven(): Boolean = true

    override fun dividers(): List<Int>{
        return (1..valueNumber).filter { valueNumber % it == 0 }
    }
}

//clase para los numero impares

data class OddNumber(override val valueNumber: Int): Number{
    override fun isPrime(): Boolean = false
    override fun isEven(): Boolean = false

    override fun dividers(): List<Int> {
        return (1..valueNumber).filter { valueNumber % it == 0 }
    }
}