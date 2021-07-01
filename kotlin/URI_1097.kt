fun main(args: Array<String>) {
    var i = 1
    var j = 7
    while (i <= 9) {
        println("I=$i J=$j")
        println("I=$i J=${j-1}")
        println("I=$i J=${j-2}")
        j += 2
        i += 2
    }
}
