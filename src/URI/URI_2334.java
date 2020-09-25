package URI;

import java.math.BigInteger;
import java.util.Scanner;

public class URI_2334 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		BigInteger bi = sc.nextBigInteger();
		BigInteger aux = BigInteger.ONE.negate();
		
		while (bi.compareTo(aux) != 0) {
			System.out.println(bi.compareTo(BigInteger.ZERO) > 0 ? bi.add(aux) : bi);			
			bi = sc.nextBigInteger();
		}
		
		sc.close();
	}
}