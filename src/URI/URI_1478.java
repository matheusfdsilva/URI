package URI;
import java.util.Scanner;

public class URI_1478 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				
		int n = sc.nextInt();
		
		while (n != 0) {
			
			int[][]M = new int[n][n];
			
			for(int l = 0; l < n; l++) {
				for(int c = 0; c < n; c++) {					
					M[l][c] = (Math.abs(l - c)) + 1;															
				}
				
			}
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					
					System.out.printf("%3d ", M[i][j]);
					if(j == n - 1) {
						System.out.println();
					} 	
				}
			}
			System.out.println();
			n = sc.nextInt();
		}
		
		
		sc.close();

	}

}
