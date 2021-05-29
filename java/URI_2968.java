package URI;

import java.util.Scanner;

public class URI_2968 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int voltas = sc.nextInt();
		int placas = sc.nextInt();
		
		int totPlacas = voltas * placas;		
		
		for (int i = 1; i <= 9; i++) {
			double numeroPlaca = Math.ceil(totPlacas * i / 10.0);			
			
			if (i < 9) System.out.printf("%.0f ", numeroPlaca);
			else System.out.printf("%.0f\n", numeroPlaca);			
		}
		
		sc.close();
	}
}
