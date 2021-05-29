package URI;

import java.util.Scanner;

public class URI_1240 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
				
		for (int i = 0; i < n; i++) {
			String x = sc.next();
			String y = sc.next();
			
			if (y.length() > x.length()) System.out.println("nao encaixa");
			else if (x.substring(x.length() - y.length()).equals(y)) System.out.println("encaixa");
			else System.out.println("nao encaixa");
			
		}		
		sc.close();
	}
}
