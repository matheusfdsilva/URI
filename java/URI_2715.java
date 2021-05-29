package URI;

import java.math.BigInteger;
import java.util.Scanner;

public class URI_2715 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int[] works = new int[n];
			for (int i = 0; i < n; i++) {
				works[i] = sc.nextInt();
			}
			
			BigInteger rangel = BigInteger.valueOf(works[0]);
			BigInteger gugu = BigInteger.ZERO;
			
			int auxRangel = 1;
			int auxGugu = 0;
			int cont = 1;
			
			if (n > 1) {
				gugu = BigInteger.valueOf(works[n-1]);
				auxGugu = n - 2;
				cont++;
			}
						
			while (cont < n) {
				BigInteger valueRangel = BigInteger.valueOf(works[auxRangel]);
				BigInteger valueGugu = BigInteger.valueOf(works[auxGugu]);
				if (rangel.add(valueRangel).subtract(gugu).compareTo(gugu.add(valueGugu).subtract(rangel)) <= 0) {
					rangel = rangel.add(valueRangel);
					auxRangel++;
				}
				else {					
					gugu = gugu.add(valueGugu);
					auxGugu--;
				}
				cont++;				
			}
			
			System.out.println(rangel.subtract(gugu).abs());			
		}				
		
		sc.close();
	}
}