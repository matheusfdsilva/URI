import java.util.*

val notas = intArrayOf(10000,5000,2000,1000,500,200)
val moedas = intArrayOf(100, 50, 25, 10, 5, 1)

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)
    var reais = (sc.nextDouble() * 100).toInt()

    println("NOTAS:")
    for(nota in notas) {
        val quantidade = reais/nota
        println("$quantidade nota(s) de R$ ${nota/100}.00")
        reais -= quantidade * nota
    }

    println("MOEDAS:")
    for(moeda in moedas) {
        val quantidade = reais/moeda
        println("$quantidade moeda(s) de R$ ${"%.2f".format(moeda/100.0)}")
        reais -= quantidade * moeda
    }
}