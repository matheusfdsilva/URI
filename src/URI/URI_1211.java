package URI;

import java.util.Arrays;
import java.util.Scanner;

public class URI_1211 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		while (sc.hasNext()) {
			int n = sc.nextInt();			
			String[] phones = new String[n];						
			for (int i = 0; i < n; i++) {
				String str = sc.next();
				phones[i] = str;					
			}
			
			Arrays.sort(phones);
			int dig = 0;			
			for (int i = 1; i < n; i++) {	
				int aux = 0;
				while (aux < phones[i].length() && phones[i].charAt(aux) == phones[i-1].charAt(aux)) {
					dig++;
					aux++;
				}				
			}
			
			System.out.println(dig);
		}			
		
		sc.close();
	}
}