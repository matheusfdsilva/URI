package URI;

import java.util.Scanner;

public class URI_2678 {

	public static final String[] LETTERS = new String[] {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String str = sc.nextLine().toUpperCase();			
			StringBuilder phone = new StringBuilder();					
		
			phone = makePhone(str, phone);					
			System.out.println(phone.toString());
		}
				
		sc.close();
	}
	
	static StringBuilder makePhone(String str, StringBuilder phone) {
		for (char ch : str.toCharArray()) {
			for (int k = 0; k < LETTERS.length; k++) {
				if (LETTERS[k].contains(ch+"")) {					
					phone.append(k+2);					
				}
			}
			if (ch == '*' || ch == '#' || Character.isDigit(ch)) {
				phone.append(ch);
			}
		}
		
		return phone;
	}
}