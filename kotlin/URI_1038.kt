import java.util.*

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)
    val codigo = sc.nextInt()
    val quantidade = sc.nextInt()
    val total = when (codigo) {
        1 -> quantidade * 4.00
        2 -> quantidade * 4.50
        3 -> quantidade * 5.00
        4 -> quantidade * 2.00
        else -> quantidade * 1.50
    }
    println("Total: R$ ${"%.2f".format(total)}")
}
