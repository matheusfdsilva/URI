package URI;

import java.util.Scanner;

public class URI_2927 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int c = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (a + x + y >= c) {
			if (x > y / 2) {
				System.out.println("Caio, a culpa eh sua!");
			}
			else {
				System.out.println("Igor bolado!");
			}
		}
		else {
			System.out.println("Igor feliz!");
		}
		
		sc.close();
	}
}