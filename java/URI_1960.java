package URI;

import java.util.Scanner;

public class URI_1960 {
	
	static final int[] DECIMAL_VALUE = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	static final String[] ROMAN_VALUE = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
				
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String romanNumber = "";
		
		for (int i = 0; n > DECIMAL_VALUE.length; i++) {
			int result = n / DECIMAL_VALUE[i];			
			n = n % DECIMAL_VALUE[i];			
			if (result > 0) {
				for (int x = 0; x < result; x++) {
					romanNumber += ROMAN_VALUE[i];
				}
			}
		}
		
		System.out.println(romanNumber);	
		
		sc.close();
	}
}
