package URI;
import java.util.Scanner;

public class URI_1435 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();			
		
		while(n != 0) {		
			int[][] M = new int[n][n];			
			
			for(int l = 1; l <= n; l++) {
				for(int c = 1; c <= n; c++) {	
					int aux = l;					
					
					if(c < aux) {
						aux = c ;
					}
					if(n - l + 1 < aux) {
						aux = n - l + 1;
					}
					if(n - c + 1 < aux) {
						aux = n - c + 1;
					}
					M[l-1][c-1] = aux;														
				}
				
			}	
			
			for(int l = 0; l < M.length; l++) {
				for(int c = 0; c < M[l].length; c++) {
					System.out.printf("%3d", M[l][c]);
					if (c < n - 1) System.out.print(" ");
					else System.out.println();	
				}					
			}			
			
			System.out.println();
			n = sc.nextInt();			
		}
		
		
		sc.close();

	}

}
