package URI;

import java.util.Scanner;

public class URI_1129 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n != 0) {			
			for (int i = 0; i < n; i++) {
				int count = 0;
				char letter = ' ';
				for (char ch = 'A'; ch < 'F'; ch++) {
					int pixel = sc.nextInt();
					if (pixel <= 127) {
						count++;
						letter = ch;
					}
				}	
				System.out.println(count == 1 ? letter : "*");
			}
			
			n = sc.nextInt();
		}
		
		sc.close();
	}
}