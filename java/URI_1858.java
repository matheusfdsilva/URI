package URI;

import java.util.Scanner;

public class URI_1858 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] algoz = new int[n];
		
		for(int i = 0; i < n; i++) {
			algoz[i] = sc.nextInt();
		}
		
		int numero = min(algoz);
		System.out.println(numero);
		
		sc.close();

	}
	public static int min(int[]vect) {
		int posicao = 0;
		int menor = vect[0];
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < menor) {
				menor = vect[i];
				posicao = i;
			}
		}
		return posicao + 1;
	}
}
