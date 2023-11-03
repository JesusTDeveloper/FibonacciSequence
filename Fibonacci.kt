fun main() {
    // Inicializamos la variable para la cantidad de términos en la secuencia de Fibonacci.
    var quantity: Int

    // Solicitamos al usuario que ingrese la cantidad de términos que desea generar.
    do {
        println("Secuencia Fibonacci\nIngrese la cantidad de términos que desea generar:")
        quantity = readlnOrNull()?.toIntOrNull() ?: 0

        // Verificamos que la cantidad ingresada sea al menos 1.
        if (quantity < 1) {
            println("La cantidad de términos debe ser al menos 1.")
        }
    } while (quantity < 1)

    // Inicializamos las variables para calcular la secuencia de Fibonacci.
    var current = 0
    var next = 1

    // Generamos y mostramos la secuencia de Fibonacci.
    for (i in 1..quantity) {
        print("$current ")

        val temporary = current + next
        current = next
        next = temporary
    }
}
