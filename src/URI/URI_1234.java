package URI;

import java.util.Scanner;

public class URI_1234 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			
			StringBuilder dancingSentence = new StringBuilder(sc.nextLine());
			int temp = 0;
						
			for (int i = 0; i < dancingSentence.length(); i++) {
				char ch = dancingSentence.charAt(i);
				if (Character.isLetter(ch)) {					
					if (temp % 2 == 0) dancingSentence.setCharAt(i, Character.toUpperCase(ch));				
					else dancingSentence.setCharAt(i, Character.toLowerCase(ch));
					temp++;
				}								
			}
			
			System.out.println(dancingSentence.toString());				
		}		
		
		sc.close();
	}
}
