import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var segundos = sc.nextInt()

    val horas = segundos / 3600
    val minutos = segundos % 3600 / 60
    val segundoss = segundos % 3600 % 60
    println("$horas:$minutos:$segundoss")
}