import java.util.*

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)

    val salario = sc.nextDouble()
    val novoSalario = when (salario) {
        in 0.0..400.00 -> salario * 1.15
        in 400.01..800.00 -> salario * 1.12
        in 800.01..1200.00 -> salario * 1.1
        in 1201.00..2000.00 -> salario * 1.07
        else -> salario * 1.04
    }
    val reajuste = novoSalario - salario
    val percentagem = reajuste / salario * 100
    println("Novo salario: ${"%.2f".format(novoSalario)}")
    println("Reajuste ganho: ${"%.2f".format(reajuste)}")
    println("Em percentual: ${"%.0f".format(percentagem)} %")
}
