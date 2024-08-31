package org.example

//Interface que usaran las clases de numero

interface Number{
    val valueNumber : Int
    fun isPrime(): Boolean
    fun isEven(): Boolean
    fun dividers(): List<Int>
}


