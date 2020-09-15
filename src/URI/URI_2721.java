package URI;

import java.util.Scanner;

public class URI_2721 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] renas = new String[] {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen", "Rudolph"};
		
		int sum = 0;
		int aux;
		
		for (int i = 0; i < 9; i++) {
			sum += sc.nextInt();
		}		
		
		if (sum % 9 == 0) {
			aux = 8;
		}
		else {
			aux = sum % 9 - 1;
		}
		
		System.out.println(renas[aux]);
		
		sc.close();

	}

}
