package URI;

import java.util.Scanner;

public class URI_2453 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		StringBuilder decod = new StringBuilder();	
		int aux = 0;
		
		for (int i = 0; i < s.length(); i++) {	
			char ch = s.charAt(i);
			if (aux % 2 != 0 || ch == ' ') {
				decod.append(ch);	
				aux = -1;
			}			
			aux++;
						
		}

		System.out.println(decod.toString());
		
		sc.close();
	}
}
