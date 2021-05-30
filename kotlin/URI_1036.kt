import java.util.*
import kotlin.math.sqrt

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)

    val a = sc.nextDouble()
    val b = sc.nextDouble()
    val c = sc.nextDouble()

    val delta = b * b - 4 * a * c
    when {
        delta < 0 || a == 0.0 -> println("Impossivel calcular")
        else -> {
            val x1 = (-b + sqrt(delta))/ (2 * a)
            val x2 = (-b - sqrt(delta))/ (2 * a)
            println("R1 = ${"%.5f".format(x1)}")
            println("R2 = ${"%.5f".format(x2)}")
        }
    }
}
