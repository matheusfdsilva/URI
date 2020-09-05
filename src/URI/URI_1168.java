package URI;

import java.util.Scanner;

public class URI_1168 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] leds = new int[] {2,5,5,4,5,6,3,7,6,6};
		String[] numeros = new String[] {"1","2","3","4","5","6","7","8","9","0"};
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			int totLeds = 0;
			String numero = sc.next();
			
			for (int t = 0; t < numero.length(); t++) { // percorre cada letra da string (no caso o número)				
				for (int l = 0; l < numeros.length; l++) { 
					if (numero.substring(t, t+1).equals(numeros[l])) {
						totLeds += leds[l];						
					}
				}				
			}
			System.out.println(totLeds + " leds");
		}
		
		
		sc.close();
	}

}
