import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()

    if(a % b == 0 || b % a == 0) {
        println("Sao Multiplos");
    }
    else {
        println("Nao sao Multiplos");
    }
}
