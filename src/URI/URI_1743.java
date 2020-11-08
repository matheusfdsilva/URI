package URI;

import java.util.Scanner;

public class URI_1743 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] fieldA = sc.nextLine().split(" ");
		String[] fieldB = sc.nextLine().split(" ");
		
		boolean ok = checkPlugs(fieldA, fieldB);
		System.out.println(ok ? "Y" : "N");
		
		sc.close();
	}

	private static boolean checkPlugs(String[] fieldA, String[] fieldB) {
		for (int i = 0; i < fieldA.length; i++) {
			if (fieldA[i].equals(fieldB[i])) {
				return false;
			}
		}
		return true;
	}
}