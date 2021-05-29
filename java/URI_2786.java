package URI;

import java.util.Scanner;

public class URI_2786 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int c = sc.nextInt();		
		
		int tot1 = c * l + (c - 1) * (l - 1);				
		int tot2 = (l - 1) * 2 + (c - 1) * 2;
		
		System.out.println(tot1);
		System.out.println(tot2);
		
		sc.close();
	}
}
