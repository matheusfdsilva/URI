package URI;

import java.math.BigInteger;
import java.util.Scanner;

public class URI_1578 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int numberMatriz = 4;
		
		for (int i = 0; i < n; i++) {
			if (i > 0) {
				System.out.println();
			}
			
			int lenght = sc.nextInt();
			String[][] matriz = new String[lenght][lenght];
			for (int l = 0; l < lenght; l++) {
				for (int r = 0; r < lenght; r++) {
					long num = sc.nextLong();
					matriz[l][r] = String.valueOf(BigInteger.valueOf(num).pow(2));
				}
			}			
			
			for (int x = 0; x < lenght; x++) {
				int maxLenght = checkMaxLenghtColumn(matriz, x);
				modifyNumbers(matriz, maxLenght, x);				
			}
			
			printer(matriz, numberMatriz);
			numberMatriz++;			
		}		
		
		sc.close();		
	}

	private static Integer checkMaxLenghtColumn(String[][] matriz, int x) {
		int maxLenght = 0;		
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i][x].length() > maxLenght) {
				maxLenght = matriz[i][x].length();				
			}
		}
		return maxLenght;		
	}

	private static void modifyNumbers(String[][] matriz, int maxLenght, int x) {
		for (int i = 0; i < matriz.length; i++) {
			StringBuilder sb = new StringBuilder(matriz[i][x]);
			while (sb.length() != maxLenght) {
				sb.insert(0, " ");
			}
			matriz[i][x] = sb.toString();		
		}
	}
	
	private static void printer(String[][] matriz, int numberMatriz) {
		System.out.println("Quadrado da matriz #" + numberMatriz + ":");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j]);
				System.out.print(j < matriz.length -1 ? " " : "\n");
			}
		}		
	}
}