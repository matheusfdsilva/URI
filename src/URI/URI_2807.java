package URI;

import java.util.Scanner;

public class URI_2807 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[]icanno = new int[n];
		int first = 1;
		icanno[n-1] = first;		
		
		for (int i = n - 2; i >= 0; i--) {
			int proximo = first;
			icanno[i] = proximo;
			first = proximo + icanno[i + 1];			
		}		
		
		for (int i = 0; i < icanno.length; i++) {
			if (i < icanno.length - 1) System.out.print(icanno[i] + " ");			
			else System.out.println(icanno[i]);
		}
		
		sc.close();
	}
}
