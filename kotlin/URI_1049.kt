import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val a = sc.next()
    val b = sc.next()
    val c = sc.next()

    val animal = if (a == "vertebrado") {
        if (b == "ave") {
            if (c == "carnivoro") {
               "aguia"
            } else {
                "pomba"
            }
        } else {
            if (c == "onivoro") {
                "homem"
            } else {
                "vaca"
            }
        }
    } else {
        if (b == "inseto") {
            if (c == "hematofago") {
               "pulga"
            } else {
              "lagarta"
            }
        } else {
            if (c == "hematofago") {
               "sanguessuga"
            } else {
               "minhoca"
            }
        }
    }
    println(animal)
}
