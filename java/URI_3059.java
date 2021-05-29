package URI;

import java.util.Scanner;

public class URI_3059 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = sc.nextInt();
		int f = sc.nextInt();
		
		int[] vect = new int[n];
		for (int j = 0; j < n; j++) {
			vect[j] = sc.nextInt();
		}
		
		int pares = 0;
		
		for (int l = 0; l < vect.length; l++) {
			for (int c = 0; c < vect.length; c++) {
				if (c != l && vect[l] + vect[c] >= i && vect[l] + vect[c] <= f) {
					pares++;
				}
			}
		}
		
		System.out.println(pares / 2); // dividido por 2 pq da maneira que eu fiz repete os pares
		
		sc.close();
	}
}