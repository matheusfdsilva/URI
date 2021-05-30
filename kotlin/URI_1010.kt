import java.util.*

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)
    var total = 0.0

    for (i in 0..1) {
        val codigo = sc.nextInt()
        val quantidade = sc.nextInt()
        val valor = sc.nextDouble()
        total += quantidade * valor
    }

    println("VALOR A PAGAR: R$ ${"%.2f".format(total)}")
}