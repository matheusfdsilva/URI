package URI;

import java.util.Scanner;

public class URI_3076 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();			
			if (n % 100 != 0) System.out.println(n / 100 + 1);
			else System.out.println(n / 100);
		}		
		
		sc.close();

	}
}
