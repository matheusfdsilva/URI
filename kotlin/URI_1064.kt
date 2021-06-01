import java.util.*

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)
    var soma = 0.0
    var positivos = 0
    for (i in 1..6) {
        val n = sc.nextDouble()
        if (n > 0) {
            soma += n
            positivos++
        }
    }
    println("$positivos valores positivos")
    println("%.1f".format(soma/positivos))
}
