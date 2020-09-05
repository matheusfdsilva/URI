package URI;

import java.util.Scanner;

public class URI_2253 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {			
			String password = sc.nextLine();			
			int lUpper = 0, lLower = 0, num = 0;			
			boolean correct = true;
			int aux = 0;
			
			while (correct && aux < password.length()){
				char ch = password.charAt(aux);
				if (Character.isAlphabetic(ch)) {
					if (Character.isUpperCase(ch)) lUpper++;
					else lLower++;
				}
				else if (Character.isDigit(ch)) num++;
				else correct = false;
				
				aux++;
			}		
			if (num < 1 || lLower < 1 || lUpper < 1 || password.length() < 6 || password.length() > 32)  correct = false;
			
			if (correct) System.out.println("Senha valida.");
			else System.out.println("Senha invalida.");
		}
		
		
		sc.close();

	}

}
