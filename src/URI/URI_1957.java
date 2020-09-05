package URI;

import java.util.Scanner;

public class URI_1957 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String hexa = Integer.toHexString(n);
		System.out.println(hexa.toUpperCase());
		
		
		sc.close();
	}

}
