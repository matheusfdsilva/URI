import java.util.*

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)
    val cobaias = mutableMapOf<String, Int>()
    val n = sc.nextInt()
    repeat(n) {
        val quantia = sc.nextInt()
        val tipo = sc.next()
        val quantiaDoTipo = cobaias[tipo] ?: 0
        cobaias[tipo] = quantia+quantiaDoTipo
    }

    val coelhos = cobaias["C"] ?: 0
    val ratos = cobaias["R"] ?: 0
    val sapos = cobaias["S"] ?: 0
    val total = coelhos + ratos + sapos
    val percentualCoelhos = coelhos / (total*1.0) * 100
    val percentualRatos = ratos / (total*1.0) * 100
    val percentualSapos = sapos / (total*1.0) * 100

    println("Total: $total cobaias")
    println("Total de coelhos: $coelhos")
    println("Total de ratos: $ratos")
    println("Total de sapos: $sapos")
    println("Percentual de coelhos: ${"%.2f".format(percentualCoelhos)} %")
    println("Percentual de ratos: ${"%.2f".format(percentualRatos)} %")
    println("Percentual de sapos: ${"%.2f".format(percentualSapos)} %")
}
