package URI;

import java.util.Scanner;

public class URI_1110 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n != 0) {
			Integer[]cartas = new Integer[n];
			
			for (int i = 1; i <= n; i++) {
				cartas[i-1] = i;
			}
			
			int remain = n;
			System.out.print("Discarded cards:");
			
			while (remain > 1) {
				for (int x = 0; x < n; x++) {
					if (cartas[x] != null) {
						if (remain > 2) {
							System.out.print(" " + cartas[x] + ",");
						}
						else {
							System.out.print(" " + cartas[x]);
						}
						cartas[x] = null;
						remain--;
						if (remain == 1) break;						
						
						if (x < n - 2) {
							int aux = cartas[x+1];
							for (int l = x + 1; l < n - 1; l++) {
								cartas[l] = cartas[l+1];							
							}
							cartas[n-1] = aux;
						}						
					}					
				}				
			}
			System.out.println();
			System.out.print("Remaining card: " );
			for (int i = 0; i < n; i++) {
				if (cartas[i] != null) System.out.println(cartas[i]);
			}
			
			n = sc.nextInt();			
		}		
		sc.close();
	}
}
