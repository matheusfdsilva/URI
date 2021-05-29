package URI;

import java.util.Scanner;

public class URI_1786 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			
			String nineDigits = sc.next();			
			int sumB1 = 0;
			int sumB2 = 0;
			int aux = 10;
			
			for (int i = 1; i <= 9; i++) {
				sumB1 += Integer.parseInt(nineDigits.charAt(i-1)+"") * i;
				sumB2 += Integer.parseInt(nineDigits.charAt(i-1)+"") * (aux - i);				
			}
			if (sumB1 % 11 == 10) nineDigits += "0";
			else nineDigits += sumB1 % 11;
						
			if (sumB2 % 11 == 10) nineDigits += "0";
			else nineDigits += sumB2 % 11;
			
			String cpf = nineDigits.substring(0, 3) + "." + nineDigits.substring(3, 6) + "." + nineDigits.substring(6, 9) + "-" + nineDigits.substring(9);
			System.out.println(cpf);			
		}	
		
		sc.close();
	}
}
