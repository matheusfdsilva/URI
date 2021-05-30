import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()

    val mensagem = if (b > c && d > a && c + d > a + b && c >= 0 && d >= 0) {
        "Valores aceitos"
    } else {
        "Valores nao aceitos"
    }

    println(mensagem)
}
