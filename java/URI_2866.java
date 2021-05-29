package URI;

import java.util.Scanner;

public class URI_2866 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
						
			String string = sc.next();
			String ocultString = "";
			for (int x = string.length() - 1; x >= 0; x--) {
				if (Character.isLowerCase(string.charAt(x))) ocultString += string.charAt(x);
			}
			System.out.println(ocultString);
		}		
		
		sc.close();
	}
}
