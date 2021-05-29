package URI;

import java.util.Scanner;

public class URI_3093 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			String monte = sc.next();
			if (monte.contains("A") && monte.contains("J") && monte.contains("K") && monte.contains("Q")) {
				System.out.println("Aaah muleke");
			}
			else System.out.println("Ooo raca viu");
		}
		
		sc.close();
	}
}