import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var pares = 0
    for (i in 1..5) {
        val n = sc.nextInt()
        if (n % 2 == 0) pares++
    }
    println("$pares valores pares")
}
