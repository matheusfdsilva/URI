package URI;

import java.util.Scanner;

public class URI_1779{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int provas = sc.nextInt();		
			int seq = 0, auxSeq = 0, maiorNota = 0;
			int nota = 0;
			for (int k = 0; k < provas; k++) {
				nota = sc.nextInt();
				if (k == 0) {
					maiorNota = nota;
				}
				if (nota == maiorNota) {
					maiorNota = nota;
					auxSeq++;
				}
				else if (nota > maiorNota) {
					maiorNota = nota;					
					auxSeq = 1;
					seq = auxSeq;
				}
				else {	
					if (auxSeq > seq) {
						seq = auxSeq;
					}					
					auxSeq = 0;					
				}
			}
			if (auxSeq > seq) {
				seq = auxSeq;
			}			
			
			System.out.println("Caso #" + i + ": "+ seq);
		}
		
		sc.close();
	}
}