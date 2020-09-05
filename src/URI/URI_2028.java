package URI;

import java.util.Scanner;

public class URI_2028 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int caso = 1;
		
		while (sc.hasNext()) {
			
			int n = sc.nextInt();			
			int cont = 0;
			
			for (int i = 0; i <= n; i++) {				
				int contRepeticao = 0;
				
				if (i == 0) {					
					cont++;
				}								
				while (contRepeticao < i) {				
					contRepeticao++;
					cont++;
				}				
			}
			int[]vect = new int[cont];
			int aux = 0;
				
			for (int p = 0; p <= n; p++) {				
				int contRepeticao = 0;
					
					if (p == 0) {
						vect[aux] = p;
						aux++;
					}									
					while (contRepeticao < p) {	
						vect[aux] = p;
						contRepeticao++;
						aux++;
					}				
				}
			
			if (vect.length == 1) {
				System.out.println("Caso " + caso + ": " + vect.length + " numero");
			} else {
				System.out.println("Caso " + caso + ": " + vect.length + " numeros");
			}
			
			cont = 0;
			for (int number : vect) {
				if (cont < vect.length - 1) {
					System.out.print(number + " ");
				} else {
					System.out.println(number);
				}
				cont++;
			}			
			System.out.println();
			caso++;
		}		
		
		sc.close();
	}
}
