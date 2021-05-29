package URI;

import java.util.Scanner;

public class URI_1441 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n != 0) {
			int maior = 1;
			while (n != 1) {
				if (n > maior) {
					maior = n;
				}
				
				if (n % 2 == 0) {
					n *=  0.5;
				}
				else {
					n = n * 3 + 1;
				}				
			}
			System.out.println(maior);
			n = sc.nextInt();
		}		
		
		sc.close();
	}
}