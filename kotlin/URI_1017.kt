import java.util.*

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)
    val tempo = sc.nextInt()
    val velocidade = sc.nextInt()
    println("%.3f".format(tempo*velocidade/12.0))
}