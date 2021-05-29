package URI;

import java.util.Scanner;

public class URI_1516 {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		while (n != 0 && x != 0) {			
			
			String[][] fields = new String[n][x];
			for (int i = 0; i < fields.length; i++) {
				fields[i] = sc.next().split("");				
			}
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int height = a / n;
			int widht = b / x;
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < height; j++) {
					int column = 0;					
					for (int k = 0; k < b; k++) {
						if (k >= widht && k % widht == 0) {
							column++;							
						}
						System.out.print(fields[i][column]);						
					}
					System.out.println();
				}
			}
			
			n = sc.nextInt();
			x = sc.nextInt();	
			System.out.println();
		}				
		
		sc.close();

	}
}