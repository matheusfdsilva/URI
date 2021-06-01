import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val dias: Int
    val minutos: Int
    val horas: Int
    val segundos: Int
    var resto: Int

    sc.next()
    val w: Int = sc.nextInt()
    val x: Int = sc.nextInt()
    sc.next()
    val y: Int = sc.nextInt()
    sc.next()
    val z: Int = sc.nextInt()
    val duracaoInicio = w * 24 * 60 * 60 + x * 60 * 60 + y * 60 + z

    sc.next()
    val w2: Int = sc.nextInt()
    val x2: Int = sc.nextInt()
    sc.next()
    val y2: Int = sc.nextInt()
    sc.next()
    val z2: Int = sc.nextInt()
    val duracaoFim = w2 * 24 * 60 * 60 + x2 * 60 * 60 + y2 * 60 + z2
    val duracao = duracaoFim - duracaoInicio


    dias = duracao / (24 * 60 * 60)
    resto = duracao % (24 * 60 * 60)
    horas = resto / (60 * 60)
    resto %= (60 * 60)
    minutos = resto / 60
    segundos = resto % 60

    println("$dias dia(s)")
    println("$horas hora(s)")
    println("$minutos minuto(s)")
    println("$segundos segundo(s)")
}
