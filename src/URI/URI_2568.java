package URI;

import java.util.Scanner;

public class URI_2568 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int d = sc.nextInt();
		int i = sc.nextInt();
		int x = sc.nextInt();
		int f = sc.nextInt();
						
		int value = i - x * (f / 2) + x * (f - (f / 2));
		
		if (d % 2 == 0) {
			value = i - x * (f - (f / 2)) +  x * (f / 2);
		}
		
		System.out.println(value);		
		
		sc.close();
	}
}