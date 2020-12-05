package URI;

import java.util.Scanner;

public class URI_1615 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] vect = new int[n+1];
			for (int k = 0; k < m; k++) {
				int cod = sc.nextInt();
				vect[cod] = vect[cod] + 1;
			}
						
			int codiguin = winner(vect, m);
			System.out.println(codiguin);
		}
				
		sc.close();
	}

	private static int winner(int[] vect, int m) {
		for (int i = 1; i < vect.length; i++) {
			double avg = vect[i] / (m * 1.0);			
			if (avg > 0.50) {
				return i;
			}
		}
		return -1;
	}
}