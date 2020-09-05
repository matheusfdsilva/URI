package URI;

import java.util.Scanner;

public class URI_1267 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int d = sc.nextInt();
		
		while (n != 0 & d != 0) {
			int[][] dinners = new int[d][n];
			
			for (int i = 0; i < d; i++) {
				for (int j = 0; j < n; j++) {
					dinners[i][j] = sc.nextInt();
				}
			}
			
			if (leastOne(dinners, n)) System.out.println("yes");
			else System.out.println("no");
			
			n = sc.nextInt();
			d = sc.nextInt();
		}		
		
		sc.close();

	}
	static boolean leastOne(int[][] m, int columns) {
		boolean status = false;					
		
		for (int j = 0; j < columns; j++) {
			for (int i = 0; i < m.length; i++) {
				if (m[i][j] == 1) status = true;
				else {
					status = false;
					break;
				}				
			}	
			if (status) return true;
		}		
		return false;
	}	
}
