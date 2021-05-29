package URI;

import java.util.Scanner;

public class URI_2679 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if (x % 2 != 0) System.out.println(x + 1);
		else System.out.println(x + 2);
		
		
		sc.close();
	}
}