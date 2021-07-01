import java.util.*

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    var i = 0.0
    var j = 1.0

    while (i <= 2) {
        if (i == 0.0 || i == 1.0 || i > 1.8) {
            println("I=${"%.0f".format(i)} J=${"%.0f".format(j)}")
            println("I=${"%.0f".format(i)} J=${"%.0f".format(j+1)}")
            println("I=${"%.0f".format(i)} J=${"%.0f".format(j+2)}")
        } else {
            println("I=${"%.1f".format(i)} J=${"%.1f".format(j)}")
            println("I=${"%.1f".format(i)} J=${"%.1f".format(j+1)}")
            println("I=${"%.1f".format(i)} J=${"%.1f".format(j+2)}")
        }
        i += 0.2
        j += 0.2
    }
}
