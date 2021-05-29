package URI;

import java.util.Scanner;

public class URI_1397 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while (n != 0) {
			int scorep1 = 0;
			int scorep2 = 0;
			
			for (int i = 0; i < n; i++) {
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				
				if (n1 > n2) scorep1++;
				if (n2 > n1) scorep2++;
			}
			System.out.println(scorep1 + " " + scorep2);
			n = sc.nextInt();			
		}
		
		sc.close();
	}
}