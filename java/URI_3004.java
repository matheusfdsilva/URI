package URI;

import java.util.Scanner;

public class URI_3004 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d;
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();					
			
			if (a < c && b < d || a < d && b < c) {
				System.out.println("S");
			}
			else System.out.println("N");
		}
		
		sc.close();
	}	
}