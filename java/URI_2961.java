package URI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class URI_2961 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<Integer, String> map = new HashMap<>();	
		int[] acertos = new int[4];	
		int n = sc.nextInt();		
		
		sc.nextLine();		
		for (int m = 0; m < n; m++) {		
			sc.nextLine(); // palpites
			for (int i = 1; i <= 4; i++) {
				String ator = sc.nextLine();
				map.put(i, ator);
			}
			sc.nextLine(); // vencedores
			for (int i = 1; i <= 4; i++) {
				String atorWiner = sc.nextLine();
				if (map.get(i).equals(atorWiner)) {
					acertos[i-1] += 1;					
				}
			}			
		}
		
		String categories = "";
		for (int i = 0; i < 4; i++) {
			if (acertos[i] < 1) {
				categories += (i+1) + " ";
			}
		}
		System.out.println(categories.trim());		
		
		sc.close();
	}
}