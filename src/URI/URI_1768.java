package URI;

import java.util.Scanner;

public class URI_1768 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			
			int n = sc.nextInt();
			int centro = n / 2;
			
			int altura = centro + 1;					
						
			int aux = centro + 1;
			int aux2 = centro - 1;			
			
			for (int l = 0; l < altura + 2; l++) {
				System.out.print("\n");	
				for (int c = 0; c < n; c++) {
					if (c > aux2 && c < aux) {						
						System.out.print("*");
					} 
					else {
						System.out.print(" ");
					}						
				}
				if (l == altura - 1) {
					aux = centro + 1;
					aux2 = centro - 1;
				}
				else {
					aux += 1;
					aux2 -= 1;
				}							
			}
			System.out.println();
		}			
		
		sc.close();

	}

}
