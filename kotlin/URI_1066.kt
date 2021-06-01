import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var pares = 0
    var impares = 0
    var positivos = 0
    var negativos = 0
    for (i in 1..5) {
        val n = sc.nextInt()
        if (n % 2 == 0) pares++
        else impares++
        if (n > 0) positivos++
        else if (n < 0) negativos++
    }
    println("$pares valor(es) par(es)")
    println("$impares valor(es) impar(es)")
    println("$positivos valor(es) positivo(s)")
    println("$negativos valor(es) negativo(s)")
}
