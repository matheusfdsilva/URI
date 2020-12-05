package URI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class URI_2469 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		
		Map<Integer, Integer> map = new HashMap<>();
		int r = 1;
		
		for (int i = 0; i < n; i++) {
			int nota = sc.nextInt();
			if (map.containsKey(nota)) {
				int turns = map.get(nota) + 1;
				if (turns > r) {
					r = turns;
				}
				map.put(nota, turns);
			}
			else {
				map.put(nota, 1);
			}
		}
		
		int max = 0;		
		for (Integer obj : map.keySet()) {
			int value = map.get(obj);
			if (value == r && obj > max) {
				max = obj;
			}
		}
		System.out.println(max);		
		
		sc.close();
	}
}