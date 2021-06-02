import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var maior = Int.MIN_VALUE
    var posicao = 0
    repeat(100){
        val n = sc.nextInt()
        if (n > maior) {
            maior = n
            posicao = it + 1
        }
    }
    println("$maior\n$posicao")
}
