package URI;

import java.util.Scanner;

public class URI_2721 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] renas = new String[] {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen", "Rudolph"};
		
		int sum = 0;
		int aux = -1;
		
		for (int i = 0; i < 9; i++) {
			sum += sc.nextInt();
		}		
		
		while (sum >= 1) {
			sum--;
			if (aux == 8) aux = -1;
			aux++;
		}
		
		System.out.println(renas[aux]);
		
		sc.close();

	}

}
