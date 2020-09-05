package URI;

import java.util.Scanner;

public class URI_1250 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {			
			int[]shots = new int[sc.nextInt()];
			
			for (int x = 0; x < shots.length; x++) {
				shots[x] = sc.nextInt();
			}
						 
			String[] moviment = sc.next().split("");
			int hit = 0;
			
			for (int x = 0; x < shots.length; x++) {
				if (moviment[x].equals("J") & shots[x] > 2 || moviment[x].equals("S") && shots[x] <= 2) hit++;			
			}
			
			System.out.println(hit);
		}
		
		sc.close();

	}

}
