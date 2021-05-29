package URI;

import java.util.Scanner;

public class URI_2775 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[][] packages = new int[2][n];
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < n; j++) {
					packages[i][j] = sc.nextInt();
				}
			}
			
			int time = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 1; j < n; j++) {
					if (packages[0][j] < packages[0][j-1]) {
						time += packages[1][j] + packages[1][j-1];
						int auxPackage = packages[1][j];
						packages[1][j] = packages[1][j-1];
						packages[1][j-1] = auxPackage;
						int auxPos = packages[0][j];
						packages[0][j] = packages[0][j-1];
						packages[0][j-1] = auxPos;
					}
				}
			}			
						
			System.out.println(time);
		}		
		
		sc.close();
	}
}