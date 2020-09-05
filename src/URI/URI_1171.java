package URI;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class URI_1171 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Map<Integer, Integer> freq = new TreeMap<>();		
		
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			
			if (freq.containsKey(num)) {
				int cont = freq.get(num) + 1;
				freq.put(num, cont);
			} else {
				freq.put(num, 1);
			}
		}
		
		for (Integer key : freq.keySet()) {
			System.out.println(key + " aparece " + freq.get(key) + " vez(es)");
		}
				
		sc.close();
	}
}
