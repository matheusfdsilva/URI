package URI;

import java.util.Scanner;

public class URI_2551 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			double record = 0;
			
			for (int i = 1; i <= n; i++) {
				int minutos = sc.nextInt();
				int distancia = sc.nextInt();
				
				if ((double) distancia / minutos > record) {
					record = (double) distancia / minutos;
					System.out.println(i);
				}
			}
		}		
		
		sc.close();
	}
}
