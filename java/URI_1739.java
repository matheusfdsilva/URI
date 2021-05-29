package URI;

import java.util.Scanner;

public class URI_1739 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int n = sc.nextInt();
			long[] threebonaci = new long[n];
			long n1 = 0L, n2 = 1L;
			int aux = 0;
			while (threebonaci[n-1] == 0) {
				long num = fibonaci(n1, n2);
				n1 = n2;
				n2 = num;
				if (isThreebonaci(num)) {
					threebonaci[aux] = num;
					aux++;
				}
			}
			
			System.out.println(threebonaci[n-1]);			
		}		
				
		sc.close();
	}

	private static boolean isThreebonaci(long num) {
		if (num % 3 == 0) {
			return true;
		}
		String s = String.valueOf(num);
		return s.contains("3");		
	}

	private static long fibonaci(long n1, long n2) {
		return n1 + n2;
	}
}
