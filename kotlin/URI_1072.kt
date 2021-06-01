import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    var dentro = 0
    var fora = 0
    for (i in 1..n) {
        val numero = sc.nextInt()
        when (numero) {
            in 10..20 -> dentro++
            else -> fora++
        }
    }

    println("$dentro in")
    println("$fora out")
}
