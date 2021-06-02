import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    for (i in 1..10000) {
        if (i % n == 2) println(i)
    }
}
