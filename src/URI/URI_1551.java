package URI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class URI_1551 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			Set<Character> set = new HashSet<>();			
			String st = sc.nextLine();
			for (char ch : st.toCharArray()) {
				if (Character.isAlphabetic(ch)) set.add(ch);
			}
			if (set.size() == 26) System.out.println("frase completa");
			else if (set.size() >= 13) System.out.println("frase quase completa");
			else System.out.println("frase mal elaborada");
		}
		
		
		sc.close();

	}
}