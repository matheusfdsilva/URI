import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val y = sc.nextInt()
    var soma = 0

    val range = if(x > y) (y+1) until x else (x+1) until y
    for (i in range) {
        if (i % 2 != 0) soma += i
    }

    println(soma)
}
