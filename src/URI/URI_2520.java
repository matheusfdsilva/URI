package URI;

import java.util.Scanner;

public class URI_2520 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int l = sc.nextInt();
			int c = sc.nextInt();			
			int rowTreiner = 0, columnTreiner = 0;
			int rowPokemon = 0, columnPokemon = 0;
			
			for (int i = 0; i < l; i++) {
				for (int j = 0; j < c; j++) {
					int x = sc.nextInt();
					if (x == 1) {
						rowTreiner = i;
						columnTreiner = j;
					}
					if (x == 2) {
						rowPokemon = i;
						columnPokemon= j;
					}
				}
			}
			
			int time = Math.abs(columnTreiner - columnPokemon) + Math.abs(rowTreiner - rowPokemon);
			System.out.println(time);
		}
		
		sc.close();
	}
}
