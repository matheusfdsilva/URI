package URI;

import java.util.Scanner;

public class URI_1278 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int caso = 0;
		
		while (n != 0) {
			
			sc.nextLine();			
			String[] vect = new String[n];
			int maxLenght = 0;
			
			if (caso > 0) System.out.println();
			
			for (int i = 0; i < n; i++) {
				String str = sc.nextLine().replaceAll("\\s+"," ").trim();
				vect[i] = str;
				if (str.length() > maxLenght) {
					maxLenght = str.length();
				}
			}
			
			for (String obj : vect) {
				System.out.printf("%" + maxLenght + "s%n", obj);
			}			
			
			caso++;
			n = sc.nextInt();	
		}				
		
		sc.close();
	}
}