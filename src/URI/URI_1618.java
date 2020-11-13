package URI;

import java.util.Scanner;

public class URI_1618 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int[] fields = new int[10];
			for (int k = 0; k < 10; k++) {
				fields[k] = sc.nextInt();
			}
			
			int xA = fields[0];
			int yA = fields[1];
			int xB = fields[2];
			int yD = fields[5];
			int xR = fields[8];
			int yR = fields[9];

			if (xR >= xA && xR <= xB && yR >= yA && yR <= yD) {
				System.out.println(1);
			} 
			else {
				System.out.println(0);
			}
		}

		sc.close();
	}
}