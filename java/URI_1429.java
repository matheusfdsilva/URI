package URI;

import java.util.Scanner;

public class URI_1429 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String number = sc.next();
		
		while (!number.equals("0")) {					
			int sum = 0;
			int aux = number.length();
			int aux2 = 0;
			
			while (aux > 0) {
				sum += Integer.parseInt(number.charAt(aux2)+"") * fatorial(aux);
				aux--;
				aux2++;
			}
			
			System.out.println(sum);
			number = sc.next();			
		}
		
		sc.close();

	}
	static int fatorial(int n) {
		int fat = 1;
		
		for (int i = n; i >= 1; i--) {
			fat *= i;
		}		
		return fat;
	}
}
