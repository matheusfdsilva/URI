package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);			
		
		float nota1= sc.nextFloat();
		float nota2 = sc.nextFloat();
		float nota3 = sc.nextFloat();
		float nota4 = sc.nextFloat();
		
		float media = (nota1 * 2f + nota2 * 3f + nota3 * 4f + nota4 * 1f) / 10f;
		System.out.printf("Media: %.1f%n", media);
		
		if(media >= 7f) {
			System.out.println("Aluno aprovado.");
		}
		else if(media < 5f) {
			System.out.println("Aluno reprovado.");
		}
		else {
			System.out.println("Aluno em exame.");
			float notaExame = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n", notaExame);
			float mediaFinal = (media + notaExame) / 2f;
			if(mediaFinal >= 5.0) {
				System.out.println("Aluno aprovado.");
			}
			else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f%n", mediaFinal);
		}				
		
		sc.close();

	}

}
