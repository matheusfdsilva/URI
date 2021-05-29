package URI;

import java.util.Scanner;

public class URI_2831 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] caixas = new int[n+1];
		caixas[0] = 0;
		
		for (int i = 1; i <= n; i++) {
			caixas[i] = sc.nextInt();
		}
		
		System.out.println(isPossible(caixas) ? "S" : "N");		
		
		sc.close();		

	}

	private static boolean isPossible(int[] caixas) {
		for (int i = 1; i < caixas.length; i++) {
			if (caixas[i] - caixas[i-1] > 8) {
				return false;
			}
		}
		return true;
	}
}