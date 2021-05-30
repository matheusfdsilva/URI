import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()

    val maiorAB = (a + b + abs(a - b)) / 2
    val maior = (maiorAB + c + abs(maiorAB - c)) / 2

    println("$maior eh o maior")
}