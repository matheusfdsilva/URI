import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var idade = sc.nextInt()

    val anos = idade / 365
    val meses = idade % 365 / 30
    val dias = idade % 365 % 30
    println("$anos ano(s)\n$meses mes(es)\n$dias dia(s)")
}