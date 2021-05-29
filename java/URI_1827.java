package URI;

import java.util.Scanner;

public class URI_1827 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int centro = n / 2;
			int interna = n / 3;					
			int externa = (n - 1) - interna;			
			
			for (int l = 0; l < n; l++) {
				for (int c = 0; c < n; c++) {					
					
					if (l == centro && c == centro) System.out.print(4);
					else if (l >= interna && c >= interna && l <= externa && c <= externa) System.out.print(1);
					else if (l == c) System.out.print(2);
					else if (c == n - l - 1) System.out.print(3);
					else System.out.print(0);										
				}
				System.out.println();
			}
			System.out.println();
		}		
		
		sc.close();
	}
}