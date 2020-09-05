package URI;

import java.util.Scanner;

public class URI_1249 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String string = sc.nextLine();
			String newString = "";
			
			for (int i = 0; i < string.length(); i++) {
				char aux = string.charAt(i);				
				
				if (Character.isLetter(aux)) {
					if (Character.isUpperCase(aux)) {
						if (aux + 13 <= 'Z') newString += (char) (aux + 13);
						else newString += (char) (aux - 13);
					}
					else {
						if (aux + 13 <= 'z') newString += (char) (aux + 13);
						else newString += (char) (aux - 13);						
					}					
				}
				else {
					newString += aux;
				}
			}
			System.out.println(newString);
		}
		
		sc.close();
	}
}
