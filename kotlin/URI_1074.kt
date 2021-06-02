import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    repeat(n) {
        val numero = sc.nextInt()
        when {
            numero == 0 -> println("NULL")
            numero % 2 == 0 -> {
                if (numero > 0) println("EVEN POSITIVE")
                else println("EVEN NEGATIVE")
            }
            else -> {
                if (numero > 0) println("ODD POSITIVE")
                else println("ODD NEGATIVE")
            }
        }
    }
}
