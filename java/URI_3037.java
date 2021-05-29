package URI;

import java.util.Scanner;

public class URI_3037 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int joao = 0, maria = 0;
			int X, D;
			
			for (int j = 0; j < 3; j++) {
				X = sc.nextInt();
				D = sc.nextInt();
				joao += X * D;
			}
			for (int m = 0; m < 3; m++) {
				X = sc.nextInt();
				D = sc.nextInt();
				maria += X * D;
			}
			if (joao > maria) System.out.println("JOAO");
			else System.out.println("MARIA");
		}
		
		
		
		sc.close();

	}

}
