package URI;

import java.util.Scanner;

public class URI_1312 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n != 0) {
			int quadrados = 0;
			for (int i = n; i >= 1; i--) {
				quadrados += Math.pow(i ,2);
			}
			System.out.println(quadrados);
			
			n = sc.nextInt();			
		}		
		
		sc.close();
	}
}
