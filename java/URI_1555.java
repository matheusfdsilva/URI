package URI;

import java.util.Scanner;

public class URI_1555 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
						
			double rafael = Math.pow(3 * x, 2) + Math.pow(y, 2);
			double beto = 2 * Math.pow(x, 2) + Math.pow(5 * y, 2);
			double carlos = - 100 * x + Math.pow(y, 3);
						
			if (beto > rafael && beto > carlos) {
				System.out.println("Beto ganhou");
			}
			else if (carlos > rafael) {
				System.out.println("Carlos ganhou");
			}
			else {
				System.out.println("Rafael ganhou");
			}
		}
		
		sc.close();

	}

}
