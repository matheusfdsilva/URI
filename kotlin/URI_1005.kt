import java.util.*

const val pesoA = 3.5
const val pesoB = 7.5

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)
    val x = sc.nextDouble()
    val y = sc.nextDouble()

    val media: (Double, Double) -> Double = {a, b -> (a * pesoA +  b * pesoB) / 11.0}
    println(String.format("MEDIA = %.5f", media(x,y)))
}