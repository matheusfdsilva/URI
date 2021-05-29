package URI;

import java.util.Scanner;

public class URI_1540 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int y1 = sc.nextInt();
			int c1 = sc.nextInt();
			int y2 = sc.nextInt();
			int c2 = sc.nextInt();
			
			double result = (c2 - c1) / (( y2 - y1) * 1.0);
			long intPart = (long) result;			
			long decimal = (long) ((result - intPart) * 100);
			
			if (decimal < 10) {
				System.out.println(intPart + "," + decimal + "0");
			}
			else{
				System.out.println(intPart + "," + decimal);
			}			
		}		
		
		sc.close();
	}
}