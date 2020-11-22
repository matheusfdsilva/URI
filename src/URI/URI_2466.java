package URI;

import java.util.Scanner;

public class URI_2466 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] vect = new int[n];
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextInt();
		}
		
		while (n > 1) {			
			for (int i = 1; i < n; i++) {
				if (vect[i] != vect[i-1]) {
					vect[i-1] = -1;
				}
				else {
					vect[i-1] = 1;
				}
			}
			n--;
		}
		
		System.out.println(vect[0] == 1 ? "preta" : "branca");
		
		sc.close();
	}
}
