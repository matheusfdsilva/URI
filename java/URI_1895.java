package URI;

import java.util.Scanner;

public class URI_1895 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int t = sc.nextInt();
		int l = sc.nextInt();
		int alice = 0, bob = 0;
		
		for (int i = 0; i < n - 1; i++) {
			int card = sc.nextInt();
			int dif = Math.abs(card - t);
			if (dif <= l) {
				t = card;
				if (i % 2 == 0) {
					alice += dif;
				}
				else {
					bob += dif;
				}
			}
		}
		
		System.out.println(alice + " " + bob);		
		
		sc.close();
	}
}
