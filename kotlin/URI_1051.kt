import java.util.*

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)

    val renda = sc.nextDouble()
    val imposto = when {
        renda > 4500.00 -> 1000 * 0.08 + 1500 * 0.18 + (renda - 4500) * 0.28
        renda > 3000.00 -> 1000 * 0.08 + (renda - 3000.0) * 0.18
        renda > 2000.00 -> (renda - 2000) * 0.08
        else -> 0.0
    }

    if (imposto == 0.0) println("Isento")
    else println("R$ ${"%.2f".format(imposto)}")
}
