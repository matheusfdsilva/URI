package URI;

import java.util.Scanner;

public class URI_1235 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			String wrongString = sc.nextLine();
			StringBuilder rightString = new StringBuilder();			
						
			for (int x = wrongString.length() / 2 - 1; x >= 0; x--) {
				rightString.append(wrongString.charAt(x));
			}
			for (int x = wrongString.length()-1; x >= wrongString.length() / 2; x--) {
				rightString.append(wrongString.charAt(x));
			}
			
			System.out.println(rightString.toString());
		}
		
		
		sc.close();
	}
}