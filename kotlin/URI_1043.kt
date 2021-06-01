import java.util.*

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)
    val a = sc.nextDouble()
    val b = sc.nextDouble()
    val c = sc.nextDouble()

    when {
        a < b + c && b < a + c && c < b + a -> println("Perimetro = ${"%.1f".format(a+b+c)}")
        else -> println("Area = ${"%.1f".format((a+b)*c/2)}")
    }
}
