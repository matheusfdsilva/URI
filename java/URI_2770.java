package URI;

import java.util.Scanner;

public class URI_2770 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int m = sc.nextInt();
			for (int i = 0; i < m; i++) {
				int xi = sc.nextInt();
				int yi = sc.nextInt();
				if ((xi <= x && yi <= y) || (yi <= x && xi <= y)) {
					System.out.println("Sim");
				}
				else {
					System.out.println("Nao");
				}
			}
		}		
		
		sc.close();
	}
}