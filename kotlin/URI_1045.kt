import java.util.*

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)

    val a = sc.nextDouble()
    val b = sc.nextDouble()
    val c = sc.nextDouble()
    val vect = doubleArrayOf(a,b,c).sortedArrayDescending()

    val n1 = vect[0]
    val n2 = vect[1]
    val n3 = vect[2]

    when {
        n1 >= n2 + n3 ->  println("NAO FORMA TRIANGULO");
        n1 * n1 == n2 * n2 + n3 * n3 -> println("TRIANGULO RETANGULO");
        n1 * n1 > n2 * n2 + n3 * n3 -> println("TRIANGULO OBTUSANGULO");
        else -> println("TRIANGULO ACUTANGULO");
    }

    if(n1 == n2 && n1 == n3) {
        println("TRIANGULO EQUILATERO");
    }

    else if(n1 == n2 || n2 == n3 || n1 == n3) {
        println("TRIANGULO ISOSCELES");
    }
}
