import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    for (i in 1..n) {
        if (i % 2 != 0) println(i)
    }
}
