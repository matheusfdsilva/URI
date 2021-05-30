import java.util.*

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)
    val nome = sc.next()
    val salarioFixo = sc.nextDouble()
    val vendas = sc.nextDouble()
    val salarioTotal = salarioFixo + vendas * 0.15
    println("TOTAL = R$ ${"%.2f".format(salarioTotal)}")
}