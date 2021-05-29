package URI;

import java.util.Scanner;

public class URI_2926 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		StringBuilder str = new StringBuilder();
		str.append("Ent");
		addA(str, n);
		str.append("o eh N");
		addA(str, n);
		str.append("t");
		addA(str, n);
		
		System.out.println(str.toString() + "l!");
		
		sc.close();

	}

	private static void addA(StringBuilder str, int n) {
		for (int i = 0; i < n; i++) {
			str.append("a");
		}		
	}
}