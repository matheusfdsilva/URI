package URI;

import java.util.Scanner;

public class URI_1162 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int l = sc.nextInt();			
			int[] vect = new int[l];
			
			for (int k = 0; k < l; k++) {
				vect[k] = sc.nextInt();
			}
			
			int swaps = countSwaps(vect);
			System.out.printf("Optimal train swapping takes %d swaps.%n", swaps);
		}
		
		
		sc.close();

	}
	static int countSwaps(int[] vect) {
		int swaps = 0;
		
		for (int i = 0; i < vect.length; i++) {
			for (int j = 1; j < vect.length; j++) {
				if (vect[j] < vect[j-1]) {
					int temp = vect[j-1];
					vect[j-1] = vect[j];
					vect[j] = temp;
					swaps++;
				}
			}
		}
		return swaps;
	}
}
