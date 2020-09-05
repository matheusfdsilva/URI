package URI;

import java.util.Scanner;

public class URI_2540 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		while (sc.hasNext()) {
			
			int afavor = 0;
			
			int n = sc.nextInt();
			
			for (int i = 0; i < n; i++) {
				
				int voto = sc.nextInt();				
				afavor += voto;
			}
			
			double doisTerco = n * 2.0 / 3.0;
			
			if (afavor >= doisTerco) {
				System.out.println("impeachment");
			} else {
				System.out.println("acusacao arquivada");
			}
		}		
		
		sc.close();

	}

}
