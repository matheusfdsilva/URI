package URI;

import java.util.Scanner;

public class URI_2871 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int litros = 0;
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					int litro = sc.nextInt();
					litros += litro;
				}
			}
			
			int sacas = litros / 60;
			litros %= 60;
			System.out.printf("%d saca(s) e %d litro(s)\n", sacas, litros);			
		}		
		
		sc.close();		
	}
}