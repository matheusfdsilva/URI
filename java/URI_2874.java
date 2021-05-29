package URI;

import java.util.Scanner;

public class URI_2874 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {			
			int n = sc.nextInt();		
			String frase = "";
			for (int i = 0; i < n; i++) {
				String binario = sc.next();
				char ch = Character.valueOf((char) Integer.parseInt(binario, 2));
				frase += ch;
			}	
			
			System.out.println(frase);		
		}
		
		sc.close();
	}
}