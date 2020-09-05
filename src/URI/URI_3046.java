package URI;

import java.util.Scanner;

public class URI_3046 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int pecas = 0;
		
		for (int i = n + 1; i > 0; i--) {
			pecas += i;
		}
		
		System.out.println(pecas);		
		
		sc.close();
	}
}
