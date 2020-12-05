package URI;

import java.util.Scanner;

public class URI_1574 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			int p = 0;
			int m = sc.nextInt();
			String[] vect = new String[m];
			sc.nextLine();
			for (int k = 0; k < m; k++) {
				String move = sc.nextLine();
				if (move.length() > 5) {
					int moves = Integer.parseInt(move.substring(8));
					move = vect[moves-1];
				}
				vect[k] = move;
			}
			
			for (String s : vect) {
				if (s.equals("LEFT")) {
					p--;
				}
				else {
					p++;
				}
			}
			
			System.out.println(p);			
		}		
		
		sc.close();
	}
}