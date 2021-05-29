package URI;

import java.util.Scanner;

public class URI_2373 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int lata, copo, quebrou = 0;
		
		for (int i = 0; i < n; i++) {
			lata = sc.nextInt();
			copo = sc.nextInt();
			if (lata > copo) quebrou += copo;
		}
		
		System.out.println(quebrou);
		
		sc.close();
	}
}
