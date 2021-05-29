package URI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class URI_1104 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			Set<Integer> alice = null;
			Set<Integer> beatriz = null;
			
			alice = buildDeck(sc, x, alice);
			beatriz = buildDeck(sc, y, beatriz);
			
			int canChange;
			
			if (alice.size() < beatriz.size()) {
				alice.removeAll(beatriz);
				canChange = alice.size();				
			}
			else {
				beatriz.removeAll(alice);
				canChange = beatriz.size();							
			}			
						
			System.out.println(canChange);
			
			x = sc.nextInt();
			y = sc.nextInt();
		}		
		
		sc.close();
	}
	
	static Set<Integer> buildDeck(Scanner sc, int x, Set<Integer> person){
		person = new HashSet<>();
		
		for (int i = 0; i < x; i++) {			
			person.add(sc.nextInt());			
		}		
		return person;
	}
}