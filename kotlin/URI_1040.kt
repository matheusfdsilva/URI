import java.util.*

fun main(args: Array<String>) {
    Locale.setDefault(Locale.US)
    val sc = Scanner(System.`in`)

    val nota1 = sc.nextFloat()
    val nota2 = sc.nextFloat()
    val nota3 = sc.nextFloat()
    val nota4 = sc.nextFloat()
    val media = (nota1 * 2 + nota2 * 3 + nota3 * 4 + nota4) / 10
    println("Media: ${"%.1f".format(media)}")

    when  {
        media >= 7.0 -> println("Aluno aprovado.")
        media in 5.0..6.9 -> {
            println("Aluno em exame.")
            val notaExame = sc.nextFloat()
            println("Nota do exame: ${"%.1f".format(notaExame)}")
            val novaMedia = (media + notaExame) / 2
            val mensagem = if (novaMedia >= 5.0) "Aluno aprovado." else "Aluno reprovado."
            println(mensagem)
            println("Media final: ${"%.1f".format(novaMedia)}")
        }
        else -> println("Aluno reprovado.")
    }
}
