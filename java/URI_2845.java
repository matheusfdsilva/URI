package URI;

import java.util.Scanner;

public class URI_2845 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int maior = 0;
		
		for (int i = 0; i < n; i++) {
			int id = sc.nextInt();
			if (id > maior) maior = id;
		}
		
		System.out.println(maior + 1);
		
		sc.close();
	}
}
