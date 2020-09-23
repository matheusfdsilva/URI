package URI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class URI_2947 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alternativas = sc.nextInt();
		String gabaritoErrado = sc.next();		
		int maxNota = 0;		
		int n = sc.nextInt();
		
		Map<Character, Integer>map = new HashMap<>();
		String[]vect = new String[n];
				
		for (int i = 0; i < n; i++) {
			vect[i] = sc.next();
		}
		
		for (int i = 0; i < alternativas; i++) {
			for (int j = 0; j < vect.length; j++) {
				char ch = vect[j].charAt(i);
				if (ch != gabaritoErrado.charAt(i)) {
					if (map.containsKey(ch)) {
						map.put(ch, map.get(ch)+1);
					}
					else {
						map.put(ch, 1);
					}
				}
			}
			int maior = 0;
			for (Integer key : map.values()) {
				if (key > maior) maior = key;
			}
			maxNota += maior;
			map.clear();
		}
		
		System.out.println(maxNota);
		
		sc.close();
	}
}