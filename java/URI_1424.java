package URI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class URI_1424 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			Map<Integer, List<Integer>> map = new HashMap<>();			
			int n = sc.nextInt();
			int m = sc.nextInt();
			for (int i = 0; i < n; i++) {
				int numero = sc.nextInt();
				if (map.containsKey(numero)) {
					List<Integer> list = map.get(numero);
					list.add(i+1);
					map.put(numero, list);
				}
				else {
					List<Integer> list = new ArrayList<>();
					list.add(i+1);
					map.put(numero, list);
				}				
			}
			
			for (int i = 0; i < m; i++) {
				int ocorrencia = sc.nextInt();
				int numero = sc.nextInt();
				int indexOf = 0;
				if (map.containsKey(numero)) {
					List<Integer> list = map.get(numero);				
					if (list.size() >= ocorrencia) {
						indexOf = list.get(ocorrencia-1);				
					}						
				}	
				
				System.out.println(indexOf);
			}				
		}			
		
		sc.close();

	}	
}