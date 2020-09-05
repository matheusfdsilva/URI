package URI;

import java.math.BigInteger;
import java.util.Scanner;

public class URI_2867 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			BigInteger x = sc.nextBigInteger();
			int y = sc.nextInt();
			BigInteger result = x.pow(y);
			String digits = String.valueOf(result);
			System.out.println(digits.length());
		}
		
		
		sc.close();

	}

}
