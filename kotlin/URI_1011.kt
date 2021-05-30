import java.util.*
import kotlin.math.pow

const val PI = 3.14159

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)
    val raio = sc.nextInt()
    raio.let {
        val volume = 4/3.0 * PI * (it * 1.0).pow(n = 3)
        println("VOLUME = ${"%.3f".format(volume)}")
    }
}