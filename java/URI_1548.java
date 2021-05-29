package URI;

import java.util.Arrays;
import java.util.Scanner;

public class URI_1548 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int alunos = sc.nextInt();
			int trocou = 0;
			int[]notas = new int[alunos];
			int[]aux = new int[alunos];
			
			for (int a = 0; a< notas.length; a ++) {
				notas[a] = sc.nextInt();
				aux[a] = notas[a];
			}
			
			Arrays.sort(notas);
			int auxPosicao = alunos - 1;
			for (int a = 0; a < notas.length; a++) {
				if (aux[a] != notas[auxPosicao]) trocou++; // como eu ordenei o array principal, faremos a comparação da seguinte maneira: posição 0 com a n-1; 1 com n-2 etc
				auxPosicao--;
			}
			System.out.println(alunos - trocou);			
			
		}		
		sc.close();
	}
}
