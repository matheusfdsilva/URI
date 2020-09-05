package URI;

import java.util.Scanner;

public class URI_2949 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int anao = 0, elfo = 0, humano = 0, mago = 0, hobbit = 0;
		
		for (int i = 0; i < n; i++) {
			String nome = sc.next();
			char raca = sc.next().charAt(0);
			
			if (raca == 'A') anao++;
			else if (raca == 'E') elfo++;
			else if (raca == 'H') humano++;
			else if (raca == 'M') mago++;
			else hobbit++;
		}		
		System.out.println(hobbit + " Hobbit(s)");
		System.out.println(humano + " Humano(s)");
		System.out.println(elfo + " Elfo(s)");
		System.out.println(anao + " Anao(s)");
		System.out.println(mago + " Mago(s)");		
		
		sc.close();
	}
}
