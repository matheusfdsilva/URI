package URI;

import java.util.Scanner;

public class URI_2356 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String dna = sc.next();
			String seq = sc.next();
			
			if (dna.contains(seq)) System.out.println("Resistente");
			else System.out.println("Nao resistente");
		}
		
		sc.close();
	}
}
