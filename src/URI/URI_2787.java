package URI;

import java.util.Scanner;

public class URI_2787 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int c = sc.nextInt();
		
		if (l % 2 == 0) {
			if (c % 2 != 0) System.out.println(0);
			else System.out.println(1);
		} else {
			if (c % 2 != 0) System.out.println(1);
			else System.out.println(0);
		}
		
		sc.close();
	}
}
