package URI;

import java.util.Scanner;

public class URI_2717 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a + b > n) System.out.println("Deixa para amanha!");
		else System.out.println("Farei hoje!");		
		
		sc.close();

	}
}
