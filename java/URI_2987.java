package URI;

import java.util.Scanner;

public class URI_2987 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char l = sc.next().charAt(0);
		int posicao = l + 1 - 'A';
		System.out.println(posicao);
		
		
		sc.close();
	}
}
