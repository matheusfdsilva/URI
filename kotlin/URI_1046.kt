import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val horaInicial = sc.nextInt()
    val horaFinal = sc.nextInt()

    val duracao = when {
        horaInicial < horaFinal -> horaFinal-horaInicial
        else -> 24 - horaInicial + horaFinal
    }
    println("O JOGO DUROU $duracao HORA(S)")
}
