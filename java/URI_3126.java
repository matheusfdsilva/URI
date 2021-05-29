package URI;

import java.util.Scanner;

public class URI_3126 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int p = 0;
		
		for (int i = 0; i < n; i++) {
			int c = sc.nextInt();
			if (c == 1) p++;
		}
		
		System.out.println(p);
		
		sc.close();

	}

}
