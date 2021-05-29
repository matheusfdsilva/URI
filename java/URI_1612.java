package URI;

import java.util.Scanner;

public class URI_1612 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			int tempo = num % 2 == 0 ? num / 2 : num / 2 + 1;
			System.out.println(tempo);
		}
		
		sc.close();		
	}
}