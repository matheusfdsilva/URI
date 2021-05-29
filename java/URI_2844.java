package URI;

import java.util.Scanner;

public class URI_2844 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int aM = sc.nextInt();
		int rM = sc.nextInt();
		int eM = sc.nextInt();
		
		int aV = sc.nextInt();
		int rV= sc.nextInt();
		int eV = sc.nextInt();
		
		sc.nextLine();
		String string = sc.nextLine();
		
		int timeM = aM * 2 + rM + eM * string.length();
		int timeV = aV * 2 + rV + eV * string.length();
		
		if (timeM == timeV) System.out.println("Empate");
		else if (timeM < timeV) System.out.println("Matheus");
		else System.out.println("Vinicius");		
				
		sc.close();
	}
}