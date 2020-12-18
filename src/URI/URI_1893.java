package URI;

import java.util.Scanner;

public class URI_1893 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (y <= 2) {
			System.out.println("nova");
		}
		else if (y >= 97){
			System.out.println("cheia");
		}
		else if (y > x) {
			System.out.println("crescente");
		}
		else {
			System.out.println("minguante");
		}		
		
		
		sc.close();
	}
}