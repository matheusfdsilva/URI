import java.util.*

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)
    var positivos = 0
    for (i in 1..6) {
        val numero = sc.nextDouble()
        if (numero > 0) positivos++
    }
    println("$positivos valores positivos")
}
