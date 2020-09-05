package URI;

import java.util.Scanner;

public class URI_1026 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			long x = sc.nextLong();
			long y = sc.nextLong();
			System.out.println(x ^ y);
		}
		
		sc.close();

	}
}