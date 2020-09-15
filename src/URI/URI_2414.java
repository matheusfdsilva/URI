package URI;

import java.util.Scanner;

public class URI_2414 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int bigger = n;
		
		while (n != 0) {
			n = sc.nextInt();
			if (n > bigger) bigger = n;
		}
		
		System.out.println(bigger);
		
		sc.close();
	}
}