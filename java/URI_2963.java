package URI;

import java.util.Scanner;

public class URI_2963 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] votos = new int[n];
		for (int i = 0; i < n; i++) {
			votos[i] = sc.nextInt();
		}
		
		if (maisVotado(votos)) System.out.println("S");
		else System.out.println("N");
		
		sc.close();

	}
	public static boolean maisVotado(int[]vect) {
		int max = vect[0];
		boolean status = false;
		
		for (int i : vect) {
			if (max >= i) {
				status = true;
			}
			else return status = false;
		}
		return status;		
	}
}
