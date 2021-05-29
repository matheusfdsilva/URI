package URI;

import java.util.Scanner;

public class URI_1329 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n != 0) {
			int totMary = 0, totJohn = 0;
			
			for (int i = 0; i < n; i++) {
				int num = sc.nextInt();
				if (num == 0) totMary++;
				else totJohn ++;
			}
			
			System.out.println("Mary won " + totMary + " times and John won " + totJohn + " times");
			n = sc.nextInt();
		}		
		sc.close();
	}
}
