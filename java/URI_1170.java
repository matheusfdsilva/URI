package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_1170 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			float x = sc.nextFloat();
			int dias = 0;			
			
			while (x > 1) {
				x /= 2;
				dias++;
			}
			
			System.out.println(dias + " dias");			
		}
		
		sc.close();	
	}
}
