import java.util.*

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)
    val number = sc.nextInt()
    val hours = sc.nextInt()
    val valueHour = sc.nextDouble()
    println("NUMBER = $number\nSALARY = U$ ${"%.2f".format(hours * valueHour)}")
}