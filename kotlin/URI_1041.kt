import java.util.*

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)

    val x = sc.nextFloat()
    val y = sc.nextFloat()

    when {
        x == 0.0F && y == 0.0F -> println("Origem")
        x == 0.0F -> println("Eixo Y")
        y == 0.0F -> println("Eixo X")
        x > 0 && y > 0 -> println("Q1")
        x > 0 && y < 0 -> println("Q4")
        x < 0 && y > 0 -> println("Q2")
        else -> println("Q3")
    }
}
