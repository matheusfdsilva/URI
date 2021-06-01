import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var n = sc.nextInt()
    var impares = 0
    while (impares < 6) {
        if (n % 2 != 0) {
            println(n)
            impares++
        }
        n++
    }
}
