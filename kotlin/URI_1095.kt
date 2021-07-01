fun main(args: Array<String>) {
    var a = 1
    for (i in 60 downTo 0 step 5) {
        println("I=$a J=$i")
        a += 3
    }
}
