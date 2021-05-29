package URI;

import java.util.Scanner;

public class URI_1534 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			
			int i = sc.nextInt();			
			
			for (int l = 0; l < i; l++) {
				for (int c = 0; c < i; c++) {	
					
					if (c == i - 1 - l) System.out.print(2);					
					else if (l == c) System.out.print(1);
					else System.out.print(3);
				}
				System.out.println();
			}
		}
		
		sc.close();
	}
}
