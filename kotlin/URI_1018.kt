import java.util.*

val notas = intArrayOf(100,50,20,10,5,2,1)

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var reais = sc.nextInt()
    println(reais)
    for(nota in notas) {
        val quantidade = reais/nota
        println("$quantidade nota(s) de R$ $nota,00")
        reais -= quantidade * nota
    }
}