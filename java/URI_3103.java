package URI;

import java.util.Arrays;
import java.util.Scanner;

public class URI_3103 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String[]digits = sc.next().split("");
			Arrays.sort(digits);
			
			if (digits[0].equals("0")) {
				for (int k = 1; k < digits.length; k++) {
					if (!digits[k].equals("0")) {
						digits[0] = digits[k];
						digits[k] = "0";
						break;
					}
				}
			}
			
			for (String string : digits) {
				System.out.print(string);
			}
			
			System.out.println();
		}
		
		sc.close();
	}
}