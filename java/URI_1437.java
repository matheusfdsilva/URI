package URI;

import java.util.Scanner;

public class URI_1437 {
	
	private static String direction = "NLSO";
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n != 0) {
			String ordens = sc.next();
			int cont = 0;				
			for (int i = 0; i < n; i++) {
				if (ordens.charAt(i) == 'D') {
					cont++;						
				}
				else {
					cont--;
				}							
			}	
									
			cont = cont % 4;
			if (cont < 0) {
				cont += 4;
			}						
			System.out.println(direction.charAt(cont));		
			
			n = sc.nextInt();
		}
		
		sc.close();		
	}
}