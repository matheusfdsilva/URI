package URI;

import java.util.Scanner;

public class URI_1793 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	
		int time = 10;
		
		while (n != 0) {
			int atual = sc.nextInt();				
			for (int i = 1; i < n; i++) {
				int x = sc.nextInt();
				int dif = x - atual;
				if (dif >= 10) {
					time += 10;
				}
				else {
					time += dif;
				}
				atual = x;
			}
			System.out.println(time);
			time = 10;
			n = sc.nextInt();
		}		
		
		sc.close();
	}
}
