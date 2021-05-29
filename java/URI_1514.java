package URI;

import java.util.Scanner;

public class URI_1514 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		while (n != 0 && m != 0) {
			int[][] matriz = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					matriz[i][j] = sc.nextInt();
				}
			}
			
			int checkList = 0;
			if (checkNumber1(matriz)) checkList++;			
			if (checkNumber2(matriz, n, m))	checkList++;			
			if (checkNumber3(matriz, n, m))	checkList++;
			if (checkNumber4(matriz)) checkList++;
			
			System.out.println(checkList);
			
			n = sc.nextInt();
			m = sc.nextInt();
		}
		
		sc.close();
	}

	private static boolean checkNumber4(int[][] matriz) {		
		for (int i = 0; i < matriz.length; i++) {
			boolean status = false;
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == 1) {
					status = true;
				}
			}
			if(!status) return false;
		}
		return true;
	}

	private static boolean checkNumber3(int[][] matriz, int row, int column) {		
		for (int j = 0; j < column; j++) {
			boolean status = false;
			for (int i = 0; i < row; i++) {
				if (matriz[i][j] == 0) {
					status = true;
				}				
			}
			if (!status) return false;
		}
		return true;
	}

	private static boolean checkNumber2(int[][] matriz, int row, int column) {		
		for (int j = 0; j < column; j++) {
			boolean status = false;
			for (int i = 0; i < row; i++) {
				if (matriz[i][j] == 1) {
					status = true;
				}				
			}
			if (!status) return false;
		}
		return true;
	}

	private static boolean checkNumber1(int[][] matriz) {		
		for (int i = 0; i < matriz.length; i++) {
			boolean status = false;
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == 0) {
					status = true;
				}
			}
			if(!status) return false;
		}
		return true;
	}
}