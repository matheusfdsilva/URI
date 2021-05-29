package URI;

import java.util.Scanner;

public class URI_2896 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int g = 0;
		
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			g = n / k + n % k;				
			System.out.println(g);			
		}				
		sc.close();
	}
}
