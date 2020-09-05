package URI;

import java.util.Scanner;

public class URI_2862 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int c = sc.nextInt();
			if (c > 8000) System.out.println("Mais de 8000!");
			else System.out.println("Inseto!");
		}
		
		sc.close();
	}
}
