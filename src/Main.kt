fun main(args: Array<String>) {
    println("Empezamos!")
    funWithoutParams()
    funWithParams(5)
    val myVariableInMain = 10 // myVariableInMain nace
    funWithParams(myVariableInMain) // myVariableInMain puede usarse
}

fun funWithoutParams(){
    println("=== Soy la función funWithoutParams ===")
}

fun funWithParams(number : Int){ // Se crea una varialbe llamada number cuyo valor será el valor que hayamos mandado (5 y 10)
    println("=== Soy la función funWithParams ===")
    println("He recibido el número recibido $number")

}

