package URI;

import java.util.Scanner;

public class URI_1253 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String wrongCipher = sc.next();
			int moves = sc.nextInt();
			String rightCipher = "";
			
			for (char ch : wrongCipher.toCharArray()) {
				char temp = (char) (ch - moves);				
				if (temp < 'A') {
					temp = (char) ('Z' - moves + 1 + ch - 'A');
					rightCipher += temp;
				}
				else rightCipher += temp;
			}
			System.out.println(rightCipher);
		}
		
		sc.close();

	}
}
