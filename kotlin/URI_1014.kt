import java.util.*

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)
    val distancia = sc.nextInt()
    val consumoTotal = sc.nextDouble()
    println("${"%.3f".format(distancia/consumoTotal)} km/l")
}