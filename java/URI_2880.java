package URI;

import java.util.Scanner;

public class URI_2880 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String msgEncrypted = sc.next();
		String crib = sc.next();
		
		int lenght = msgEncrypted.length() - crib.length();
		int cribs = 0;
		
		for (int i = 0; i <= lenght; i++) {
			boolean isPossible = true;			
			for (int k = 0, pos = i; k < crib.length(); k++, pos++) {
				if (crib.charAt(k) == msgEncrypted.charAt(pos)) {
					isPossible = false;
				}				
			}
			if (isPossible) cribs++;
		}
		
		System.out.println(cribs);		
		
		sc.close();
	}
}