package URI;

import java.util.Scanner;

public class URI_1585 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int areaPipa = x * y / 2;
			System.out.println(areaPipa + " cm2");
		}		
		
		sc.close();

	}
}
