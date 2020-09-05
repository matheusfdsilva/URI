package URI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class URI_2174 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Set<String>pokemons = new HashSet<>();
		
		for (int i = 0; i < n; i++) {
			pokemons.add(sc.next());
		}
		
		int lefts = 151 - pokemons.size();
		System.out.println("Falta(m) " + lefts + " pomekon(s).");;		
		
		sc.close();
	}
}