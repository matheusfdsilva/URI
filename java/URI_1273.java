package URI;

import java.util.Scanner;

public class URI_1273 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int teste = 0;
		
		while (n != 0) {
			if (teste > 0) System.out.println();
			String[]strings = new String[n];		
			int biggest = 0;
			
			for (int i = 0; i < n; i++) {			
				strings[i] = sc.next();
				if (strings[i].length() > biggest) biggest = strings[i].length();			
			}
			
			for (int i = 0; i < n; i++) {								
				System.out.printf("%" + biggest + "s\n", strings[i]);				
			}
			teste++;
			n = sc.nextInt();
		}		
		
		sc.close();
	}
}
