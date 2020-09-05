package URI;

import java.util.Scanner;

public class URI_1192 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {			
			String string = sc.next();
			int a = Integer.parseInt(string.substring(0,1));
			int b = Integer.parseInt(string.substring(2));
			int result = 0;
			
			if (a == b) result = a * b;
			else if (Character.isUpperCase(string.charAt(1))) result = b - a;
			else result = a + b;
			
			System.out.println(result);
		}
		sc.close();
		
	}
}
