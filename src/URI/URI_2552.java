package URI;

import java.util.Scanner;

public class URI_2552 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[][] matriz = new int[n][m];
			
			for (int l = 0; l < matriz.length; l++) {
				for (int c = 0 ; c < matriz[l].length; c++) {
					matriz[l][c] = sc.nextInt();
				}
			}
			
			for (int l = 0; l < matriz.length; l++) {
				for (int c = 0 ; c < matriz[l].length; c++) {
					if (matriz[l][c] == 1) {
						System.out.print(9);
					}
					else {
						int soma = 0;
						if (l-1 >= 0) {
							soma += matriz[l-1][c];
						}
						if (l+1 < n) {
							soma += matriz[l+1][c];
						}
						if (c+1 < m) {
							soma += matriz[l][c+1];
						}
						if (c-1 >= 0) {
							soma += matriz[l][c-1];
						}
						System.out.print(soma);
					}				
				}
				System.out.println();
			}
		}
		
		sc.close();
	}
}
