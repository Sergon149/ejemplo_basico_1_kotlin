
fun main(args: Array<String>) {
    println("Hello, world!")
    funWithoutParams()
    funWithParams(5)
    varVsVal()
    basicLoop(5)
}

fun funWithoutParams(){
    println("=== Soy la función funWithoutParams ===")
}

fun funWithParams(number : Int){
    println("=== Soy la función funWithParams ===")
    println("He recibido el número recibido $number")
}

fun varVsVal() {
    println("=== Soy la función varVsVal ===")

    // nueva variable
    var textVariable = "Soy una variable"
    println(textVariable)
    textVariable = "Ahora valgo otra cosa"
    println(textVariable)

    // nueva constante
    val textConstante = "Soy un valor fijo"
    println(textConstante)
    // No deja cambiar el valor. Si quitas el comentario de la linea siguiente dará error de compilación
    // textConstante = "Nadie puede cambiar mi valor"
}

fun basicLoop(repetitions : Int){
    println("=== Soy la función basicLoop ===")
    // Sería equivalente a for (int i := 0; i < repetitions; i++)
    repeat(repetitions){ position ->
        println("Estoy repitiendo esto por $position vez de un total de $repetitions")
    }
}

fun basicLoopItCustomized(repetitions : Int){
    println("=== Soy la función basicLoop ===")
    // Sería equivalente a for (int i := 0; i < repetitions; i++)
    repeat(repetitions){ position ->
        println("Estoy repitiendo esto por $position vez de un total de $repetitions")
    }
}