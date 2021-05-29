package URI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class URI_2653 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<String>joias = new HashSet<>();
		
		while (sc.hasNext()) {
			String peca = sc.next();
			joias.add(peca);
		}		
		System.out.println(joias.size());
		
		sc.close();
	}
}
