package URI;

import java.util.Scanner;

public class URI_1387 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int r = sc.nextInt();
		
		while (l != 0 && r != 0) {
			int soma = 0;
			soma = l + r;
			System.out.println(soma);
			
			l = sc.nextInt();
			r = sc.nextInt();
		}		
		sc.close();
	}
}
