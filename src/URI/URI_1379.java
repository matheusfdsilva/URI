package URI;

import java.util.Scanner;

public class URI_1379 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n;
		
		while (a != 0 && b != 0) {
			n = a - (b - a);
			System.out.println(n);
			a = sc.nextInt();
			b = sc.nextInt();			
		}
	
		sc.close();
	}
}