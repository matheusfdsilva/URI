import java.util.*

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)
    val n = sc.nextDouble()
    when(n) {
        in 0.0..25.00 -> println("Intervalo [0,25]")
        in 25.01..50.00 -> println("Intervalo (25,50]")
        in 50.01..75.00 -> println("Intervalo (50,75]")
        in 75.00..100.00 -> println("Intervalo (75,100]")
        else -> println("Fora de intervalo")
    }
}
