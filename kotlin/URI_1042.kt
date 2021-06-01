import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val y = sc.nextInt()
    val z = sc.nextInt()

    val array = intArrayOf(x,y,z)
    array.sort()
        .let {
            for (numero in array) println(numero)
         }

    println()
    println(x)
    println(y)
    println(z)
}
