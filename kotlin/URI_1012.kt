import java.util.*

const val PI = 3.14159

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)
    val a = sc.nextDouble()
    val b = sc.nextDouble()
    val c = sc.nextDouble()

    println("TRIANGULO: ${"%.3f".format(a * c / 2.0)}")
    println("CIRCULO: ${"%.3f".format(PI * c * c)}")
    println("TRAPEZIO: ${"%.3f".format((a + b) / 2.0 * c)}")
    println("QUADRADO: ${"%.3f".format(b * b)}")
    println("RETANGULO: ${"%.3f".format(a * b)}")
}