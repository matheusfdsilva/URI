package URI;
import java.util.Locale;
import java.util.Scanner;

public class URI_1983 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	
		int numeroAlunoMaior = 0;
		double maiorNota = 0;
		
		for (int i = 0; i < n ; i++) {
			int numeroAluno = sc.nextInt();
			double notaAluno = sc.nextDouble();
			
			if (notaAluno > maiorNota) {
				maiorNota = notaAluno;
				numeroAlunoMaior = numeroAluno;
			}					
		}
		
		if (maiorNota >= 8.0) {
			System.out.println(numeroAlunoMaior);
		} else {
			System.out.println("Minimum note not reached");
		}		
		
		sc.close();
	}

}
