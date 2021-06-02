import java.util.*

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val calculaMedia = {a:Double, b: Double, c: Double ->
       (a * 2 + b * 3 + c * 5) / 10
    }
    repeat(n) {
        val a = sc.nextDouble()
        val b = sc.nextDouble()
        val c = sc.nextDouble()
        println("%.1f".format(calculaMedia(a,b,c)))
    }
}
