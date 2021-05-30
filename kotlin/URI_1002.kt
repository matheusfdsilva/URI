import java.util.*
import kotlin.math.pow

const val n = 3.14159

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val r = sc.nextDouble()
    val area = n * (r.pow(2))
    println(String.format("A=%.4f", area))
}