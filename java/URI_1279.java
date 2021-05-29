package URI;

import java.math.BigInteger;
import java.util.Scanner;

public class URI_1279 {

	private static BigInteger zero = BigInteger.ZERO;
	private static BigInteger quatro = new BigInteger("4");
	private static BigInteger quinze= new BigInteger("15");
	private static BigInteger doiscinco = new BigInteger("55");
	private static BigInteger cem = new BigInteger("100");
	private static BigInteger quatroc = new BigInteger("400");
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		boolean flag = false;
		
		while (sc.hasNext()) {		
			BigInteger year = sc.nextBigInteger();
			if (flag) {
				System.out.println();
			}				
						
			boolean isLeap = false, isFestival = false;
			if (year.mod(quatro).equals(zero) && !year.mod(cem).equals(zero) || year.mod(quatroc).equals(zero)) {
				System.out.println("This is leap year.");		
				isLeap = true;
			}
			if (year.mod(quinze).equals(zero)) {
				System.out.println("This is huluculu festival year.");
				isFestival= true;
			}
			if (isLeap && year.mod(doiscinco).equals(zero)) {				
				System.out.println("This is bulukulu festival year.");				
			}
			if (!isLeap && !isFestival) {
				System.out.println("This is an ordinary year.");				
			}
								
			flag = true;				
		}
		
		sc.close();		
	}
}