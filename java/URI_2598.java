package URI;

import java.util.Scanner;

public class URI_2598 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int x = sc.nextInt();
			int y = sc.nextInt();
			double qtdeRadar = (Math.ceil((double) x / y));
			
			System.out.printf("%.0f%n", qtdeRadar);
		}
		
		sc.close();

	}
}