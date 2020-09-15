package URI;

import java.util.Scanner;

public class URI_2235 {
	
	public static Boolean isPossible = null;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		isPossible = check2Travel(a, b, c);
		if (!isPossible) isPossible = check3Travel(a, b, c);
		
		if (isPossible) System.out.println("S");
		else System.out.println("N");
		
		sc.close();
	}

	private static Boolean check2Travel(int a, int b, int c) {
		if(a == b || a == c || c == b) return true;
		return false;
	}

	private static Boolean check3Travel(int a, int b, int c) {
		if (a + b == c || a + c == b || c + b == a) return true;
		return false;
	}	
}