package URI;

import java.util.Scanner;

public class URI_2564 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {			
			int n = sc.nextInt();			
			int index = 0;
			int count = 0;			
			for (int i = 0; i < n-1; i++) {
				int valor = sc.nextInt();
				int resp = sc.nextInt();
				if (valor == n) {					
					index = i;
					if (resp != 1) {
						count++;
					}
				}				
				if (index != 0 && i > index && resp != 0) {					
					count++;					
				}								
			}				
			
			System.out.println(count);			
		}				
		
		sc.close();
	}
}