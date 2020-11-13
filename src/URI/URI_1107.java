package URI;

import java.util.Scanner;

public class URI_1107 {
			
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int c = sc.nextInt();
		
		while (a != 0 || c != 0) {				
			int quantity = 0;
			int[] blocos = new int[c];
			for (int i = 0; i < c; i++) {
				int n = sc.nextInt();
				blocos[i] = n;
			}			
			
			quantity += a - blocos[0];
			
			for (int i = 1; i < blocos.length; i++) {
				if (blocos[i] < blocos[i-1]) {
					quantity += blocos[i-1] - blocos[i];
				}
			}			
			
			System.out.println(quantity);				
			
			a = sc.nextInt();
			c = sc.nextInt();			
		}		
		
		sc.close();
	}
}