package URI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class URI_1553 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		while (n != 0 || k != 0) {
			Map<Integer,Integer> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				int ask = sc.nextInt();
				if (map.containsKey(ask)) map.put(ask, map.get(ask) + 1);
				else map.put(ask, 1);
			}
			
			int addAsk = 0;
			for (Integer key : map.keySet()) {
				if (map.get(key) >= k) addAsk++;
			}
			
			System.out.println(addAsk);
			
			n = sc.nextInt();
			k = sc.nextInt();
		}
		
		
		
		sc.close();

	}
}
