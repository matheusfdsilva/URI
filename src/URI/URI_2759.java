package URI;

import java.util.Scanner;

public class URI_2759 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char x = sc.next().charAt(0);
		char y = sc.next().charAt(0);
		char z = sc.next().charAt(0);
		
		System.out.printf("A = %s, B = %s, C = %s%n", x, y, z);
		System.out.printf("A = %s, B = %s, C = %s%n", y, z, x);		
		System.out.printf("A = %s, B = %s, C = %s%n", z, x, y);
		
		sc.close();

	}
}
