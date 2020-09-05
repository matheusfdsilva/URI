package URI;

import java.util.Scanner;

public class URI_1238 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String frase1 = sc.next();
			String frase2 = sc.next();
			String newFrase = "";
			
			for (int x = 0; x < frase1.length(); x++) {
				if (frase1.length() > frase2.length()) {
					if (x == frase2.length()) break;
				}
				newFrase += frase1.substring(x,x+1) + frase2.substring(x,x+1);
			}
			
			if (frase2.length() > frase1.length()) {
				newFrase += frase2.substring(frase1.length());
			}
			else newFrase += frase1.substring(frase2.length());
			System.out.println(newFrase);
		}		
				
		sc.close();
	}
}
