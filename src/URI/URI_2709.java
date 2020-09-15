package URI;

import java.util.Scanner;

public class URI_2709 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[]vect = new int[n];
			for (int i = 0; i < n; i++) {
				vect[i] = sc.nextInt();
			}
			
			int salto = sc.nextInt();
			int soma = 0;
			for (int i = vect.length-1; i >= 0; i-=salto) {
				soma += vect[i];
			}
			
			if (isPrimo(soma)) System.out.println("You’re a coastal aircraft, Robbie, a large silver aircraft.");
			else System.out.println("Bad boy! I’ll hit you.");
		}
		sc.close();

	}
	private static boolean isPrimo(int n) {
		int totDiv = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) totDiv++;
		}
		if (totDiv == 2) return true;
		return false;
	}
}