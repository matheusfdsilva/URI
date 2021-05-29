package URI;

import java.util.Scanner;

public class URI_2168 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String[][] matriz = new String[n+1][n+1];
		
		for (int i = 0; i < n + 1; i++) {
			matriz[i] = sc.nextLine().split(" ");
		}
		
		int row = 0;
		int column = 0;
		String result = "";
		while (row < n) {
			result += checkQuadra(matriz, row, column);
			column++;
			if (column == n) {
				System.out.println(result);
				result = "";
				column = 0;
				row++;
			}			
		}
		
		sc.close();	
	}

	private static String checkQuadra(String[][] matriz, int row, int column) {		
		int countCam = 0;
		for (int i = row; i < row + 2; i++) {
			for (int j = column; j < column + 2; j++) {
				if (matriz[i][j].equals("1")) countCam++;
			}
		}
		if (countCam >= 2) return "S";
		return "U";
	}
}