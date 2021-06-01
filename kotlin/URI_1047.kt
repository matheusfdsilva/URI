import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val horaInicial = sc.nextInt()
    val minutoInicial = sc.nextInt()
    val horaFinal = sc.nextInt()
    val minutoFinal = sc.nextInt()

    val instanteInicial = horaInicial * 60 + minutoInicial
    val instanteFinal = horaFinal * 60 + minutoFinal

    val duracao = if (instanteFinal > instanteInicial) {
        instanteFinal - instanteInicial
    } else {
        24 * 60 - instanteInicial + instanteFinal
    }

    val horas = duracao / 60
    val minutos = duracao % 60

    println("O JOGO DUROU $horas HORA(S) E $minutos MINUTO(S)")
}
