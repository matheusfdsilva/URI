package URI;

import java.util.Scanner;

public class URI_3097 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		int[] vect = new int[n];
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextInt();
		}
				
		
		for (int i = 0; i < q; i++) {
			int query = sc.nextInt();
			if (query == 1) {
				int a = sc.nextInt();
				int y = sc.nextInt();
				vect[a-1] = y;
			}
			else {
				int num = sc.nextInt();
				int x = sc.nextInt();
				int y = sc.nextInt();
				int sum = 0;
				for (int k = x - 1; k <= y - 1; k++) {
					if (vect[k] > num) {
						sum++;
					}
				}
				System.out.println(sum);
			}		
			
		}	
		
		
		sc.close();
	}
}