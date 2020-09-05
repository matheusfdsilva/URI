package URI;

import java.util.Scanner;

public class URI_1169 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
					
			double kg = Math.floor(Math.pow(2, x) / 12000.0);
			System.out.printf("%.0f kg\n", kg);
		}
		
		sc.close();
	}
}
