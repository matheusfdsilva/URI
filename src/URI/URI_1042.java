package URI;

import java.util.Scanner;

public class URI_1042 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] cres = new int[3];
		int[] decres = new int[3];
		
		for (int i = 0; i < 3; i++) {
			cres[i] = sc.nextInt();
			decres[i] = cres[i];
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 1; j < 3; j++) {
				if (cres[j-1] > cres[j]) {
					int aux = cres[j-1];
					cres[j-1] = cres[j];
					cres[j] = aux;
				}
			}
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println(cres[i]);
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			System.out.println(decres[i]);
		}
		
		sc.close();
		

	}

}
