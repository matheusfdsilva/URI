package URI;

import java.util.Scanner;

public class URI_1715 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		String[][] matriz = new String[n][m];
		
		for (int i = 0; i < n; i++) {
			matriz[i] = sc.nextLine().split(" ");
		}
		
		inAllMatch(matriz);
		
		sc.close();
	}

	private static void inAllMatch(String[][] matriz) {
		int cont = 0;
		for (int i = 0; i < matriz.length; i++) {
			int aux = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				if (!matriz[i][j].equals("0")) {
					aux++;
				}
			}			
			if (aux == matriz[i].length) {
				cont++;
			}
		}
		System.out.println(cont);
	}
}
