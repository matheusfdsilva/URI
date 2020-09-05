package URI;

import java.util.Scanner;

public class URI_2879 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int acerto = 0;
		
		for(int i = 0; i < n; i++) {
			int p = sc.nextInt();
			if (p != 1) acerto++;
		}		
		System.out.println(acerto);		
		
		sc.close();
	}
}
