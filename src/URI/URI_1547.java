package URI;

import java.util.Scanner;

public class URI_1547 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int qt = sc.nextInt();
			int num = sc.nextInt();			
			int aluno = 0;
			Integer difAux = null;
			for (int k = 0; k < qt; k++) {				
				int palpite = sc.nextInt();
				int difAluno = Math.abs(palpite - num);
				if (k == 0) {
					difAux = difAluno;
					aluno = 1;
				}
				else if (difAluno < difAux) {
					difAux = difAluno;
					aluno = k + 1;
				}
			}
			
			System.out.println(aluno);
		}
		
		sc.close();		
	}
}