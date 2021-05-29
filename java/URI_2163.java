package URI;

import java.util.Scanner;

public class URI_2163 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] matriz = new int[n][m];
		
		for (int l = 0; l < matriz.length; l++) {
			for (int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = sc.nextInt();
			}
		}
		
		int linha = 0, coluna = 0;
		
		for (int l = 1; l < matriz.length - 1; l++) {
			for (int c = 1; c < matriz[l].length - 1; c++) {
				if (matriz[l][c] == 42) {
					if (matriz[l-1][c] == 7 && matriz[l-1][c-1] == 7 && matriz[l][c-1] == 7 && matriz[l+1][c-1] == 7
							&& matriz[l+1][c] == 7 && matriz[l+1][c+1] == 7 && matriz[l][c+1] == 7 && matriz[l-1][c+1] == 7) {						
						coluna = c + 1;
						linha = l + 1;
					} 
				}
			}
		}		
		System.out.printf("%d %d\n",linha, coluna);		
		
		sc.close();
	}
}
