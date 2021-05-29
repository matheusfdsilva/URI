package URI;

import java.util.Scanner;

public class URI_1197 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int d = 0 + a * b * 2;
			System.out.println(d);
		}		
		sc.close();
	}
}
