import java.util.*

const val pesoA = 2
const val pesoB = 3
const val pesoC = 5

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)
    val a = sc.nextDouble()
    val b = sc.nextDouble()
    val c = sc.nextDouble()

    val media = {x : Double, y: Double, z: Double -> (x * pesoA + y * pesoB + z * pesoC) / 10.0}
    println(String.format("MEDIA = %.1f", media(a,b,c)))
}