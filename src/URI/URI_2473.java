package URI;

import java.util.Scanner;

public class URI_2473 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] vect = new int[100];
		for (int i = 0; i < 6; i++) {
			int n = sc.nextInt();
			vect[n] = 1;
		}
		
		int aux = 0;
		for (int i = 0; i < 6; i++) {
			int n = sc.nextInt();
			if (vect[n] != 0) {
				aux++;
			}
		}
		
		switch (aux) {
		case 3:
			System.out.println("terno");
			break;
		case 4:
			System.out.println("quadra");
			break;
		case 5:
			System.out.println("quina");
			break;
		case 6:
			System.out.println("sena");
			break;
		default:
			System.out.println("azar");
		}
		
		
		sc.close();
	}
}