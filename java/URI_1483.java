package URI;

import java.util.Locale;
import java.util.Scanner;

public class URI_1483 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double value = sc.nextDouble();
		String number1 = sc.next();
		String number2 = sc.next();
		
		while (value != 0.0 || !number1.equals("0") || !number2.equals("0")) {			
			number1 = addZero(number1);			
			number2 = addZero(number2);		
											
			int digits = countDigits(number1, number2);
			
			if (digits < 2) {
				boolean check = checkLastCase(number1, number2);
				digits = check ? 1 : 0;
			}
			
			double reward = 0.0;			
			
			switch (digits) {
				case 1: {
					reward = value * 16;
					break;				
				}
				case 2: {
					reward = value * 50;
					break;
				}
				case 3: {
					reward = value * 500;
					break;
				}
				case 4: {
					reward = value * 3000;
					break;
				}		
			}
			
			System.out.printf("%.2f\n", reward);
			value = sc.nextDouble();
			number1 = sc.next();
			number2 = sc.next();
		}
		
		sc.close();
	}

	private static String addZero(String number1) {
		StringBuilder sb = new StringBuilder(number1);
		while (sb.length() < 4) {
			sb.insert(0, 0);	
		}		
		return sb.toString();
	}
	
	private static int countDigits(String number1, String number2) {
		int aux1 = number1.length()-1;
		int aux2 = number2.length()-1;
		int digits = 0;
		for (int i = aux1; i > aux1 - 4; i--, aux2--) {
			if (number1.charAt(i) != number2.charAt(aux2)) {
				return digits;
			}
			digits++;
		}
		return digits;
	}	

	private static boolean checkLastCase(String number1, String number2) {
		int n1 = Integer.parseInt(number1.substring(number1.length()-2));
		int n2 = Integer.parseInt(number2.substring(number2.length()-2));
		
		if (n1 == 0) {
			n1 = 100;
		}		
		if (n2 == 0) {
			n2 = 100;
		}
		
		int result = Math.abs(n1 - n2);		
		return result <= 3 ? true : false;		
	}
}