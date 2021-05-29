package URI;

import java.util.Scanner;

public class URI_1794 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int la = sc.nextInt();
		int lb = sc.nextInt();
		int sa = sc.nextInt();
		int sb = sc.nextInt();
	
		boolean isPossible = false;
		
		if (n >= la && n <= lb && n >= sa && n <= sb) {
			isPossible = true;
		}		
		
		System.out.println(isPossible ? "possivel" : "impossivel");		
		
		sc.close();
	}		
}