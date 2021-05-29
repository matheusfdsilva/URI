package URI;

import java.util.Scanner;

public class URI_2548 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] vect = new int[n];
			for (int i = 0; i < n; i++) {
				vect[i] = sc.nextInt();
			}
			
			int sum = 0;
			for (int i = vect.length-1; m > 0; i--, m--) {
				sum += vect[i];
			}
			
			System.out.println(sum);
			
		}		
		
		sc.close();
	}
}