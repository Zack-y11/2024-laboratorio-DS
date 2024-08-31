interface IFizzBuzz{
    fun Validation(): String
}

data class FizzBuzz(val start: Int, val end: Int) : IFizzBuzz{
    override fun Validation(): String{
        var result = StringBuilder()
        for(i in start..end){
            result.append(
                when{
                    i % 3 == 0 && i % 5 == 0 -> "FizzBuzz"
                    i % 3 == 0 -> "Fizz"
                    i % 5 == 0 -> "Buzz"
                    else -> i
                }
            )
            if(i % 10 == 0){
                result.append("\n")
            }else{
                result.append(" ")
            } 
        }
        return result.toString().trim()
    }
}

fun main() {
    try{

        println("FizzBuzz, ingresa un numero valido para donde iniciar.")
        val start = readLine()?.toInt() ?: throw IllegalArgumentException("Entrada no aceptada")
        println("FizzBuzz, ingresa un numero valido para donde terminar.")
        val end = readLine()?.toInt() ?: throw IllegalArgumentException("Entrada no aceptada")
        if(start >= end) throw IllegalArgumentException("El valor para finalizar debe ser mayor que el inicio")

        if(start > 0 && end > 0) {
            val fizzBuzz = FizzBuzz(start, end)
            println(fizzBuzz.Validation())

        }else{throw IllegalArgumentException("Deben ser numero positivos mayores a cero")}

    }catch(e: Exception){println("Error Find it: ${e.message}")}
    
}



// kotlinc Main.kt -include-runtime -d Main.jar
