import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)
    val x1 = sc.nextDouble()
    val y1 = sc.nextDouble()
    val x2 = sc.nextDouble()
    val y2 = sc.nextDouble()
    val distancia = sqrt((x2-x1).pow(2) + (y2-y1).pow(2))
    println("${"%.4f".format(distancia)}")
}