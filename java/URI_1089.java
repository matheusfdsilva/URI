package URI;

import java.util.Scanner;

public class URI_1089 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n != 0) {
			int[] magnitudes = new int[n+1];
			int picos = 0;
			for (int i = 1; i < magnitudes.length; i++) {
				magnitudes[i] = sc.nextInt();
			}
			magnitudes[0] = magnitudes[n];
						
			String status = magnitudes[n] > magnitudes[n-1] ? "maior" : "menor";
			String aux;
			
			for (int i = 1; i < magnitudes.length; i++) {
				if (magnitudes[i] < magnitudes[i-1]) {
					aux = "menor";
				}
				else {
					aux = "maior";
				}
				if (!aux.equals(status)) {
					picos++;
					status = aux;
				}
			}			
			System.out.println(picos);	
			n = sc.nextInt();
		}
		
		sc.close();
	}
}